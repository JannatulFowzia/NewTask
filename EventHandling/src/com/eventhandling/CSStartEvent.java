package com.eventhandling;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.test.context.ContextConfiguration;


public class CSStartEvent implements ApplicationListener<ContextStartedEvent> {

	public void onApplicationEvent(ContextStartedEvent event) {
		System.out.println("ContextStartedEvent Received");
	}
}
