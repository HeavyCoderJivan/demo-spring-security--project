package com.jivan.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.jivan.pojo.Users;
import com.jivan.pojo.UserPrinciple;
import com.jivan.repository.UserRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MyUserDeatailsService implements UserDetailsService
{

	private final UserRepo userRepo;
	
	
	@Override
	public UserDetails loadUserByUsername(String nameName) throws UsernameNotFoundException 
	{
		
		Users user=userRepo.findByUserName(nameName);
		
		if(user==null)
		{
			System.out.println("User Not Found ");
			throw new UsernameNotFoundException("user not found");
		}
		return new UserPrinciple(user);
	}

}
