package com.example.demo.rabbitmq.listener;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import com.example.demo.rabbitmq.LogEvent;

@Component
public class CreatedHeroListener {
	
	@StreamListener(LogEvent.IN_CHANNEL)
	public void messageProcessor(Message<String>message) {
		System.err.println("**********"+message+", >>>>>>>>>>>>>>");
	}

}
