package com.demo.spirng.security.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.spirng.models.User;
import com.demo.spirng.repository.RegisterRepository;
import com.demo.spring.Exception.InvalidEmpException;

@Service
public class RegisterService {

	@Autowired
	RegisterRepository registerRepository;

	public Optional<User> getUser(Long id) throws InvalidEmpException {
		Optional<User> user = registerRepository.findById(id);
		if(registerRepository.findById(id).isPresent()) {
			 return user;
		}
		throw new InvalidEmpException(id);
	}

	public List<User> getAllUser() {
		return registerRepository.findAll();
	}

}
