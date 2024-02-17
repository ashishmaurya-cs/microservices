package com.ashish.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@SpringBootConfiguration
//@EnableAutoConfiguration
//@ComponentScan
public class HelloApp {

	public static void main(String[] args) {
		System.out.println("Hello Spring Boot!");
		SpringApplication.run(HelloApp.class, args);
	}

}
