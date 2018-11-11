package com.subhra.shopping.ws.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.subhra.shopping.ws")
public class ApplicationInitializer {


public static void main(String[] args) {
	SpringApplication.run(ApplicationInitializer.class, args);
}	
}
