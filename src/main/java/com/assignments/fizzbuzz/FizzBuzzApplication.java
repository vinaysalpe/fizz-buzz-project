package com.assignments.fizzbuzz;

import com.assignments.fizzbuzz.service.FizzBuzzServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FizzBuzzApplication {

	public static void main(String[] args) {
		SpringApplication.run(FizzBuzzApplication.class, args);

		System.out.println("Starting FizzBuzz program");
		triggerFizzBuzzProgram();
	}

	private static void triggerFizzBuzzProgram() {
		new FizzBuzzServiceImpl().executeFizzBuzzProgram(1, 101);
	}

}
