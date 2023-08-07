package com.ars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class ConsumerService1Application {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerService1Application.class, args);
	}

}
