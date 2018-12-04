package com.qa.baby.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.baby.service.BabyNameService;

@RequestMapping("${path.base}")
@RestController
public class BabyNameGenRest {

	@Autowired
	private BabyNameService service;

	@GetMapping("${path.createBabyName}")
	public String createBabyName(@PathVariable int length, @PathVariable String start) {
		return service.createBabyName(length, start);
	}
	
	@GetMapping("${path.createBabyNameNoStart}")
	public String createBabyNameNoStart(@PathVariable int length) {
		return service.createBabyName(length, "");
	}
}
