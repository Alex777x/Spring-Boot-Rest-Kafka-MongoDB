package dto;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Id implements Serializable {

	private static final long serialVersionUID = -2986561430357779070L;
	private String name;
	private String value;
	private final Map<String, Object> additionalProperties = new HashMap<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@Override
	public String toString() {
		return "Id{" +
				"name='" + name + '\'' +
				", value='" + value + '\'' +
				", additionalProperties=" + additionalProperties +
				'}';
	}
}
