package com.book.reserve.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book.reserve.service.BasicService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class BasicController {

	private final BasicService basicService;

	@GetMapping("/api/test")
	public Long getMethodTest() {
		return basicService.createBasicEntity();
	}

}
