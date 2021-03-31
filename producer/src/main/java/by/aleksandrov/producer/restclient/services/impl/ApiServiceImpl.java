package by.aleksandrov.producer.restclient.services.impl;

import by.aleksandrov.producer.restclient.services.ApiService;
import dto.Data;
import dto.Result;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ApiServiceImpl implements ApiService {

	private RestTemplate restTemplate;
	private String apiURL;

	public ApiServiceImpl(RestTemplate restTemplate, @Value("${api_url}") String apiURL) {
		this.restTemplate = restTemplate;
		this.apiURL = apiURL;
	}

	@Override
	public List<Result> getData(Integer results) {
		Data data = restTemplate.getForObject(apiURL, Data.class, results);
		if (data != null) {
			return data.getResults();
		} else {
			Data emptyData = new Data();
			return emptyData.getResults();
		}

	}

	public RestTemplate getRestTemplate() {
		return restTemplate;
	}

	public void setRestTemplate(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	public String getApiURL() {
		return apiURL;
	}

	public void setApiURL(String apiURL) {
		this.apiURL = apiURL;
	}
}
