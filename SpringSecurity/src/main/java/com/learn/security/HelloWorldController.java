package com.learn.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class HelloWorldController extends WebMvcConfigurerAdapter{
	
	@Override
	public void addViewControllers(ViewControllerRegistry register) {
		
		register.addViewController("/home").setViewName("home");
		register.addViewController("/").setViewName("home");
		register.addViewController("/hello").setViewName("hello");
		register.addViewController("/login").setViewName("login");
	}

	
}
