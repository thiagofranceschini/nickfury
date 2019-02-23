package com.example.demo.rabbitmq;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface LogEvent {

	String IN_CHANNEL ="created-hero";
	
	//@Input
	@Output(IN_CHANNEL)
	MessageChannel channel();
}
