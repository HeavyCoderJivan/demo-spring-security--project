package com.jivan.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.jivan.service.MyUserDeatailsService;

import lombok.RequiredArgsConstructor;
@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig 
{

	
	private final MyUserDeatailsService userDetailsService;
	
	@Bean
	public SecurityFilterChain securutyFilterChain(HttpSecurity http) throws Exception 
	{
		//		http.csrf(customizer -> customizer.disable());
		//		
		//		http.authorizeHttpRequests(req -> req.anyRequest().authenticated());
		//		
		//		//http.formLogin(Customizer.withDefaults());
		//		
		//		http.httpBasic(Customizer.withDefaults());
		//		
		//		http.sessionManagement(Session ->Session.sessionCreationPolicy(SessionCreationPolicy.ALWAYS));

		return 	http.csrf(customizer -> customizer.disable())
				.authorizeHttpRequests(req -> req.anyRequest().authenticated())
				.httpBasic(Customizer.withDefaults())
				.sessionManagement(Session ->Session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
				.build();
		//return http.build();	
	}
	
//	@Bean
//	public UserDetailsService userDetailsService() 
//	{
//		UserDetails user1=User.withDefaultPasswordEncoder()
//				.username("jivan")
//				.password("Jkhose@2002")
//				.roles("Java Developer")
//				.build();
//		
//		UserDetails user2=User.withDefaultPasswordEncoder()
//				.username("Megha")
//				.password("megha@2004")
//				.roles("Java full Developer")
//				.build();
//		
//		return  new InMemoryUserDetailsManager(user1,user2);	
//		
//	}
//
//	
	
	
	@Bean
	public AuthenticationProvider authenticationProvider() 
	{
		 DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
	        provider.setPasswordEncoder(new BCryptPasswordEncoder());
	        provider.setUserDetailsService(userDetailsService); // BCrypt
	        return provider;
	}
	
	
	
}
