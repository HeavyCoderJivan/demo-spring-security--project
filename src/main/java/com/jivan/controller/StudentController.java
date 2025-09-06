package com.jivan.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jivan.pojo.Student;

@RestController
public class StudentController 
{
	private List<Student> stud=new ArrayList<>(List.of(
			new Student(1, "Jivan", 22, "jivan@example.com", "Spring Boot"),
			new Student(2, "Amit", 23, "amit@example.com", "ReactJS"),
			new Student(3, "Ravi", 21, "ravi@example.com", "Python")));
	
	
	@GetMapping("/students")
	public List<Student> getAllStudent()
	{
		return stud;
		
	}

}
