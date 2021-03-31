package dto;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Data implements Serializable {

	private static final long serialVersionUID = 2270581119531433335L;
	private List<Result> results = null;
	private Info info;
	private final Map<String, Object> additionalProperties = new HashMap<>();

	public List<Result> getResults() {
		return results;
	}

	public void setResults(List<Result> results) {
		this.results = results;
	}

	public Info getInfo() {
		return info;
	}

	public void setInfo(Info info) {
		this.info = info;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@Override
	public String toString() {
		return "Data{" +
				"results=" + results +
				", info=" + info +
				", additionalProperties=" + additionalProperties +
				'}';
	}
}
