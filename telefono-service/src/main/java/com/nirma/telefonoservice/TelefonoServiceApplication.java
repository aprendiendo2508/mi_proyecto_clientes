package com.nirma.telefonoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TelefonoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TelefonoServiceApplication.class, args);
	}

}
