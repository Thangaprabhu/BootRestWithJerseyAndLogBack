package com.apple.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.apple.*" })
public class BootRestWithJerseyAndLogBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootRestWithJerseyAndLogBackApplication.class, args);
	}
}
