package com.example.test1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		System.out.println("Loading main app context");
		SpringApplication.run(App.class, args);
	}

}
