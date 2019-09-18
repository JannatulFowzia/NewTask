package com.eventhandling;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		context.start();
		HelloWorld obj = context.getBean(HelloWorld.class);
		obj.setMessage("Here we have the event handling!!");
		HelloWorld obj1 = context.getBean(HelloWorld.class);
		System.out.println(obj1.getMessage());
		context.stop();
	}
}
