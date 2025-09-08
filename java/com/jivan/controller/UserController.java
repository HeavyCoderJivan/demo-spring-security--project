package com.jivan.controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jivan.pojo.Users;
import com.jivan.service.UserService;
@RestController
public class UserController 
{
	private UserService userService;
	
	@PostMapping("/register")
	public Users register(@RequestBody Users user) 
	{
		return userService.register(user);	
	}

}
