package com.tutor;

public class LifeCycle {
public String message;

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	System.out.println(message);
}

public void init() {
	System.out.println("The State is init here");
}
public void destroy() {
	System.out.println("The State will destroy here");
}
}
