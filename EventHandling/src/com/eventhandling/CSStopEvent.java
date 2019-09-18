package com.eventhandling;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class CSStopEvent implements ApplicationListener<ContextStoppedEvent> {

	public void onApplicationEvent (ContextStoppedEvent event) {
		System.out.println("ContextStopEvent Received");
	}
}
