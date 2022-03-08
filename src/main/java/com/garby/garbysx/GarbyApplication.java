package com.garby.garbysx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication (exclude = SecurityAutoConfiguration.class)

public class GarbyApplication {

	public static void main(String[] args) {
		SpringApplication.run(GarbyApplication.class, args);
	}

}
