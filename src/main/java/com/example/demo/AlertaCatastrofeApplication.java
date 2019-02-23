package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.stream.annotation.EnableBinding;

import com.example.demo.rabbitmq.LogEvent;

@SpringBootApplication
@EnableFeignClients
public class AlertaCatastrofeApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlertaCatastrofeApplication.class, args);
	}

}
