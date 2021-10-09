package com.ironhack.bankingapi.createuserservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class CreateUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreateUserServiceApplication.class, args);
	}

}
