package com.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootConfiguration
@RestController
public class helloWorld  {

	public static void main(String[] args) {
		SpringApplication.run(helloWorld.class, args);
	}

	@RequestMapping(value = "/")
	public String sayHello() {
		return "Hi! Hello";
	}
}
