package by.aleksandrov.consumer.kafka.config;

import dto.Result;
import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.serialization.Deserializer;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Map;

public class DataDeserializer implements Deserializer<Result> {
	private boolean isKey;

	@Override
	public void configure(Map<String, ?> map, boolean b) {
		this.isKey = b;

	}

	@Override
	public Result deserialize(String s, byte[] result) {
		if (result == null)
			return null;
		try {
			ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(result));

			return (Result) objectInputStream.readObject();
		} catch (IOException | ClassNotFoundException e) {
			throw new SerializationException("Error deserializing", e);
		}
	}

	@Override
	public void close() {

	}
}