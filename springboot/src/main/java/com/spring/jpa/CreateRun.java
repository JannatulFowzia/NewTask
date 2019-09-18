package com.spring.jpa;

public interface CreateRun {
	
	default String checkJPA() {
		String d = "SpringBoot";
		System.out.println("Here just to check");
		return d;
	}
	
	static void checkCode() {
		System.out.println("Here with CheckCode");
	}

}
