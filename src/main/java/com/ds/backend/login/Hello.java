package com.ds.backend.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	
	
	
	
	@GetMapping("/")
	public String sayHello() {

		return "Hello";
	}
}
