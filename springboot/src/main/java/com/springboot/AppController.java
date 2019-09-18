package com.springboot;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.Name;
@RestController
public class AppController {
	
	@RequestMapping(value ="/", method= RequestMethod.GET)
	public String helloWorld(@RequestParam(value ="name", defaultValue = "Here") String name) {
		return "Hello World" + name + "!!";
	}
	
	@RequestMapping(value="/", method= RequestMethod.POST)
	public String helloMe(@RequestBody  Name name) {
		String id = name.getId();
		String value = name.getName();
		
		return "id : " + id + " Name : " + value;
	}
}
