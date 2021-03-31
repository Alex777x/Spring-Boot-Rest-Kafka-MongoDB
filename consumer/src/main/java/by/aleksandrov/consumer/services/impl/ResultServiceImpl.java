package by.aleksandrov.consumer.services.impl;

import by.aleksandrov.consumer.repositories.ResultRepository;
import by.aleksandrov.consumer.services.ResultService;
import dto.Result;
import org.springframework.stereotype.Service;

@Service
public class ResultServiceImpl implements ResultService {

	private final ResultRepository repository;

	public ResultServiceImpl(ResultRepository repository) {
		this.repository = repository;
	}

	@Override
	public Result saveMessage(Result result) {
		return repository.save(result);
	}
}