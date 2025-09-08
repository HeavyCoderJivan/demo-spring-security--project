package com.jivan.pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Users 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment in DB;
	private  int id;
	@Column(name = "username")
	private String userName;
	private String password;

}
