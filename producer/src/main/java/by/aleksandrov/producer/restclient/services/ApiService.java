package by.aleksandrov.producer.restclient.services;

import dto.Result;

import java.util.List;

public interface ApiService {
	List<Result> getData(Integer results);
}
