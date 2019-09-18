package com.spring.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication

public class TestJPA {
	
	
	CreateRun runData;
	
	public static void main(String args[]) {
		SpringApplication.run(TestJPA.class, args);
	}
	 

}
