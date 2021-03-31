package dto;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Picture implements Serializable {

	private static final long serialVersionUID = -1661361012627852648L;
	private final Map<String, Object> additionalProperties = new HashMap<>();
	private String large;
	private String medium;
	private String thumbnail;

	public String getLarge() {
		return large;
	}

	public void setLarge(String large) {
		this.large = large;
	}

	public String getMedium() {
		return medium;
	}

	public void setMedium(String medium) {
		this.medium = medium;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@Override
	public String toString() {
		return "Picture{" +
				"additionalProperties=" + additionalProperties +
				", large='" + large + '\'' +
				", medium='" + medium + '\'' +
				", thumbnail='" + thumbnail + '\'' +
				'}';
	}
}
