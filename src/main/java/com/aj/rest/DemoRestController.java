package com.aj.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	
	@GetMapping("/")
	public String getMsg() {
		
		int a = 10/0;
		return "Hello world";
	}
}
