package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude=SecurityAutoConfiguration.class)
public class EduGroceryApplication {

	public static void main(String[] args) {
		SpringApplication.run(EduGroceryApplication.class, args);
		System.out.println("Coad is working");
	}

}
