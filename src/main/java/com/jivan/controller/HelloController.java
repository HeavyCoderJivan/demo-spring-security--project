package com.jivan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController 
{
	@GetMapping
	public String greet() 
	{
	return "jivan to Home page";	
	}

}
