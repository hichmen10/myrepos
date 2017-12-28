package com.orange.identity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerExaple {
	
	@RequestMapping("/")
	public String hello(){
		return "Hello world";
	}

}
