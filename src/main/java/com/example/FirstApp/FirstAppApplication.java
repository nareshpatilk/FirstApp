package com.example.FirstApp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.FirstApp.controller.FirstController;

@SpringBootApplication
public class FirstAppApplication {

	private static final Logger LOG = LoggerFactory.getLogger(FirstAppApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(FirstAppApplication.class, args);
		LOG.info("Started*****************************************");
		System.out.println("Hiiiiiiiiii");
	}

}
