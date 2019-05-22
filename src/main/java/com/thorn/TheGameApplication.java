package com.thorn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.thorn.controller.QuestionController;

@SpringBootApplication
public class TheGameApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheGameApplication.class, args);
	}

}
