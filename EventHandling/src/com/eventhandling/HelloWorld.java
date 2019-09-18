package com.eventhandling;

import org.springframework.beans.factory.annotation.Autowired;

public class HelloWorld {

	public String message;

	public String getMessage() {
		return message;
	}
@Autowired
	public void setMessage(String message) {
		this.message = message;
	}
}
