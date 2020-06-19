package com.mobydigitalrrhh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MockupProyectoRrhhApplication {

	public static void main(String[] args) {
		SpringApplication.run(MockupProyectoRrhhApplication.class, args);
	}
	
	@RestController
	public class HolaController {
	    @GetMapping("/")
	    public String index() {
	        return "Hello there! I'm running.";
	    }
	}
}