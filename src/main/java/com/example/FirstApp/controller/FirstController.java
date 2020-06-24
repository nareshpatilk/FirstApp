package com.example.FirstApp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

	private static final Logger LOG = LoggerFactory.getLogger(FirstController.class);
	
	@GetMapping("/first")
	public String getFirst() {
		LOG.info("Started Logging ");
		LOG.info("ZZZZZZZZZz");
		LOG.info("dev clone 123");
		LOG.info("dev clone");
		return "Hello world";
		
//		FROM alpine/git as clone
//		WORKDIR /app
//		RUN git clone https://github.com/nareshpatilk/FirstApp.git
//
//
//		FROM maven:3.5-jdk-8-alpine as build
//		WORKDIR /app
//		COPY --from=clone /app/FirstApp /app
//		RUN mvn install
//
//
//		FROM openjdk:8-jre-alpine
//		WORKDIR /app
//		COPY --from=build /app/target/FirstApp-0.0.1-SNAPSHOT.jar /app
//		ENTRYPOINT ["java", "-jar", "FirstApp-0.0.1-SNAPSHOT.jar"]

		
		//FROM openjdk:8-jre-alpine

//RUN mkdir -p /build
//
//WORKDIR /build/
//COPY . .
//ENTRYPOINT ["java", "-jar", "/build/target/FirstApp-0.0.1-SNAPSHOT.jar"]
	}
}
