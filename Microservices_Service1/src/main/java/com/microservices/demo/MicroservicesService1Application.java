package com.microservices.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroservicesService1Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesService1Application.class, args);
	}

}
