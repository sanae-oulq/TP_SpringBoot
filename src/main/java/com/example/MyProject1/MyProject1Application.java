package com.example.MyProject1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyProject1Application {

	public static void main(String[] args) {
		SpringApplication.run(MyProject1Application.class, args);
	}

	@GetMapping
	public String hello(){
		return "Hello World!";
	}

}
