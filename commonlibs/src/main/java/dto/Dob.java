package dto;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Dob implements Serializable {

	private static final long serialVersionUID = -8882125102074359643L;
	private String date;
	private Integer age;
	private final Map<String, Object> additionalProperties = new HashMap<>();

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@Override
	public String toString() {
		return "Dob{" +
				"date='" + date + '\'' +
				", age=" + age +
				", additionalProperties=" + additionalProperties +
				'}';
	}
}
