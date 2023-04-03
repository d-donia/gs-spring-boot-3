package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import Mock;

@RestController
public class HelloController {

	public Mock m;
	@GetMapping("/")
	public String index() {
		m.myString="False";
		return "Greetings from Spring Boot!";
	}

}
