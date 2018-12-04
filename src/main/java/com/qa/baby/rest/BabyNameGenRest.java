package com.qa.baby.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.baby.service.BabyNameService;

@RequestMapping("${path.base}")
@RestController
public class BabyNameGenRest {

	@Autowired
	private BabyNameService service;

	@GetMapping("${path.createAccountNumber}")
	public String createAccountNumber(int length, string start) {
		return service.createBabyName(length, start);
	}
}
