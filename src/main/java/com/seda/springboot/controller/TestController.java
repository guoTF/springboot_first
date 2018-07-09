package com.seda.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/helloWorld")
	public String helloWorld(){
		return "helloWorld";
	}
	
	@GetMapping("/helloWorld2")
	public String helloWorld2(){
		return "helloWorld2";
	}
}