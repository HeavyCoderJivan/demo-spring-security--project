package com.jivan.controller;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jivan.pojo.Users;
import com.jivan.service.UserService;

import lombok.RequiredArgsConstructor;
@RestController
@RequiredArgsConstructor
public class UserController 
{
	private final UserService userService;
	
	private final BCryptPasswordEncoder encoder;
	
	
	@PostMapping("/register")
	public Users register(@RequestBody Users user) 
	{
	    user.setPassword(encoder.encode(user.getPassword()));
		return userService.register(user);	
	}

}
