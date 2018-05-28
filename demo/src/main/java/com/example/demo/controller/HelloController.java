package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String index() {
		return "hello world";
	}
	
	@RequestMapping("/login")
	public User login() {
		User user = new User();
		user.setUname("Frank");
		user.setPassword("11QAZ");
		return user;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
