package com.example.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.hospital.beans.Student;
import com.example.hospital.service.ServiceImplementation;



@RestController
public class PatientController {
	@Autowired
	ServiceImplementation serviceImplementation;
	@GetMapping("/hospitalurl")
	public String welcomeGreetings() {
		return serviceImplementation.welcomeGreetings();
	}
	@PostMapping("post")
	public Student provideDetails(@RequestBody Student student) {
		return student ;
		}
	
}
