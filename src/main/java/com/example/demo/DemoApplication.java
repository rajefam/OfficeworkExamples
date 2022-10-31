package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
	System.out.println("DemoApplication.main()");
	System.out.println("welcome to develop");
		SpringApplication.run(DemoApplication.class, args);
	}

}
