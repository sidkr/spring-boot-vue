package com.spring.vue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "com.spring.vue.*")
public class SpringBootVueApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootVueApplication.class, args);
	}

}
