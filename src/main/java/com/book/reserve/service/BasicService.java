package com.book.reserve.service;

import org.springframework.stereotype.Service;

import com.book.reserve.model.BasicModel;
import com.book.reserve.repository.BasicRepository;
import com.book.reserve.util.CustomStringUtils;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BasicService {

	private final BasicRepository basicRepository;

	public Long createBasicEntity() {
		String name = CustomStringUtils.createRandomString(6);
		return basicRepository.save(BasicModel.builder().name(name).build()).getId();
	}

}
