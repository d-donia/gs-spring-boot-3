package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import Mock;

@RestController
public class HelloController {


	@GetMapping("/")
	public String index() {
		Mock mock = new Mock();
		mock.myString="False";
		return "Greetings from Spring Boot!";
	}

}
