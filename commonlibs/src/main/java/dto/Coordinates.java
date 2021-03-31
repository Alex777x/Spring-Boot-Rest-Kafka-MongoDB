package dto;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Coordinates implements Serializable {

	private static final long serialVersionUID = 8710833737872188455L;
	private final Map<String, Object> additionalProperties = new HashMap<>();
	private String latitude;
	private String longitude;

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@Override
	public String toString() {
		return "Coordinates{" +
				"additionalProperties=" + additionalProperties +
				", latitude='" + latitude + '\'' +
				", longitude='" + longitude + '\'' +
				'}';
	}
}
