package by.aleksandrov.producer.kafka.config;

import dto.Result;
import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.serialization.Serializer;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Map;

public class DataSerializer implements Serializer<Result> {
	private boolean isKey;

	@Override
	public void configure(Map<String, ?> map, boolean b) {
		this.isKey = b;
	}

	@Override
	public byte[] serialize(String s, Result result) {
		if (result == null)
			return null;

		try {
			ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
			objectOutputStream.writeObject(result);
			objectOutputStream.flush();

			return outputStream.toByteArray();
		} catch (IOException e) {
			throw new SerializationException("Error serializing", e);
		}

	}

	@Override
	public void close() {

	}
}