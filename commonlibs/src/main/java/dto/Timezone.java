package dto;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Timezone implements Serializable {

	private static final long serialVersionUID = -4054646214387663564L;
	private final Map<String, Object> additionalProperties = new HashMap<>();
	private String offset;
	private String description;

	public String getOffset() {
		return offset;
	}

	public void setOffset(String offset) {
		this.offset = offset;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@Override
	public String toString() {
		return "Timezone{" +
				"additionalProperties=" + additionalProperties +
				", offset='" + offset + '\'' +
				", description='" + description + '\'' +
				'}';
	}
}
