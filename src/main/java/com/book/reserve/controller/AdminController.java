package com.book.reserve.controller;

import org.springframework.web.bind.annotation.RestController;

import com.book.reserve.service.AdminService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class AdminController {

	private final AdminService adminService;

}
