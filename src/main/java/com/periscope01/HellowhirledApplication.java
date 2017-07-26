package com.periscope01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HellowhirledApplication {

	public static void main(String[] args) {
		SpringApplication.run(HellowhirledApplication.class, args);

		System.out.println("HELLO WHIRLED!!!\n\n");
		System.out.println("Getting whirled...");
		for (int i=1; i<11; i++) {
			System.out.println("Whirl Count = " + i);
		}
	}
}
