package by.aleksandrov.producer.kafka;

import dto.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;


@Component
public class MessageProducer {

	private static final Logger LOGGER = LoggerFactory.getLogger(MessageProducer.class);

	@Autowired
	private KafkaTemplate<String, Result> kafkaTemplate;
	@Value(value = "${kafka.topic.name}")
	private String topicName;

	public void sendMessage(Result result) {
		ListenableFuture<SendResult<String, Result>> future = kafkaTemplate.send(topicName, result);

		future.addCallback(new ListenableFutureCallback<>() {
			@Override
			public void onFailure(Throwable throwable) {
				LOGGER.error("Unable to send message = {} dut to: {}%n", result, throwable.getMessage());
			}

			@Override
			public void onSuccess(SendResult<String, Result> stringDataSendResult) {
				LOGGER.info("Sent Message = {} with offset = {}%n", result, stringDataSendResult.getRecordMetadata().offset());
			}
		});
	}

	public KafkaTemplate<String, Result> getKafkaTemplate() {
		return kafkaTemplate;
	}

	public void setKafkaTemplate(KafkaTemplate<String, Result> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
}
