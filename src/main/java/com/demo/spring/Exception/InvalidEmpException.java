package com.demo.spring.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.BAD_REQUEST)
public class InvalidEmpException extends Exception{
	
	private static final long serialVersionUID = 1L;
	private String message;
	private Long id;
	

	public InvalidEmpException() {
		this.message = "";
	}

	public InvalidEmpException(String id) {
		super();
		this.message = message;
	}

	public InvalidEmpException(Long id) {
		super();
		this.id=id;
	}

	@Override
	public String toString() {
		return "Invalid Emp ID: "+this.id;
	}

}
