package com.subhra.shopping.ws.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = "com.subhra.shopping.ws")
public class ApplicationInitializer extends SpringBootServletInitializer{

@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(ApplicationInitializer.class);
	}
public static void main(String[] args) {
	SpringApplication.run(ApplicationInitializer.class, args);
}	
}
