package com.ds.backend.login;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	
	@Autowired
	UserRepository u;
	
	@GetMapping("/b")
	public User getHello() {
		/*ArrayList<Hello> hello=new ArrayList<>();
		u.findAll().forEach(hello::add);*/
		return u.findByUsername("rochana4");
	}
	
}
