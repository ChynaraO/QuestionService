package com.example.question_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuestionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuestionServiceApplication.class, args);
	}

}

//in RunConfiguration Copy the current
//click More options and add value "-Dserver.port=8081"  so it will run in 2 insatances
