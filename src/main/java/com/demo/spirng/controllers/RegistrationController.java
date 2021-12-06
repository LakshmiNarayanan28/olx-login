package com.demo.spirng.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.spirng.models.User;
import com.demo.spirng.security.services.RegisterService;
import com.demo.spring.Exception.InvalidEmpException;

@RestController
public class RegistrationController {

	@Autowired
	RegisterService registerService;
	
	@GetMapping(value="/user/{id}")
	public Optional<User> getUser(@PathVariable Long id) throws InvalidEmpException {
		return registerService.getUser(id);
	}
	
	@GetMapping(value="/user")
	public List<User> getAllUser() {
		return registerService.getAllUser();
		
	}
}
