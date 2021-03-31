package dto;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Name implements Serializable {

	private static final long serialVersionUID = 7462159904503801032L;
	private String title;
	private String first;
	private String last;
	private final Map<String, Object> additionalProperties = new HashMap<>();

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@Override
	public String toString() {
		return "Name{" +
				"title='" + title + '\'' +
				", first='" + first + '\'' +
				", last='" + last + '\'' +
				", additionalProperties=" + additionalProperties +
				'}';
	}
}
