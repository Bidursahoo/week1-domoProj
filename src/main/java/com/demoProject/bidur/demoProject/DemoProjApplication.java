package com.demoProject.bidur.demoProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoProjApplication implements CommandLineRunner {
	@Autowired
	Apple apple;
	@Autowired
	customApple customApples;

	public static void main(String[] args) {
		SpringApplication.run(DemoProjApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		apple.getApples();
		customApples.getCustomApple();
	}
}
