package dto;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Info implements Serializable {

	private static final long serialVersionUID = 6489446294777162905L;
	private String seed;
	private Integer results;
	private Integer page;
	private String version;
	private final Map<String, Object> additionalProperties = new HashMap<>();

	public String getSeed() {
		return seed;
	}

	public void setSeed(String seed) {
		this.seed = seed;
	}

	public Integer getResults() {
		return results;
	}

	public void setResults(Integer results) {
		this.results = results;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@Override
	public String toString() {
		return "Info{" +
				"seed='" + seed + '\'' +
				", results=" + results +
				", page=" + page +
				", version='" + version + '\'' +
				", additionalProperties=" + additionalProperties +
				'}';
	}
}
