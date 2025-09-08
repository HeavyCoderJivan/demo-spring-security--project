package com.jivan.service;

import org.springframework.stereotype.Service;

import com.jivan.pojo.Users;
import com.jivan.repository.UserRepo;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class UserService {
	
	private final UserRepo userRepo;

	public Users register(Users user) 
	{
		return userRepo.save( user);
		
	}
}
