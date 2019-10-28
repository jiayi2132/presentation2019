package com.example.demo;

import com.example.demo.config.ApplicationConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationConfiguration.class, args);
	}
}
