package by.aleksandrov.consumer.kafka;

import by.aleksandrov.consumer.services.ResultService;
import dto.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;

public class MessageListener {

	private static final Logger LOGGER = LoggerFactory.getLogger(MessageListener.class);

	@Autowired
	private ResultService resultService;

	@KafkaListener(topics = "${kafka.topic.name}", containerFactory = "kafkaListenerContainerFactory")
	public void listener(Result result) {
		LOGGER.info("Received message: = {} %n", result);
		resultService.saveMessage(result);
	}
}