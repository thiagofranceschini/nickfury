package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.http.ResponseEntity;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.rabbitmq.LogEvent;

@RestController("rabbit")
@EnableBinding(LogEvent.class)
public class RabbitController {

	@Autowired
	private LogEvent event;
	
	@GetMapping()
	public ResponseEntity<?>rabbitMq(){
		MessageChannel channel = event.channel();
		channel.send(MessageBuilder.withPayload("RabbitMq Rodando!!!").build());
		return ResponseEntity.ok().body("SUCESS");
	}
	
}
