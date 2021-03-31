package dto;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Street implements Serializable {

	private static final long serialVersionUID = 3894469953984647552L;
	private final Map<String, Object> additionalProperties = new HashMap<>();
	private Integer number;
	private String name;

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@Override
	public String toString() {
		return "Street{" +
				"additionalProperties=" + additionalProperties +
				", number=" + number +
				", name='" + name + '\'' +
				'}';
	}
}
