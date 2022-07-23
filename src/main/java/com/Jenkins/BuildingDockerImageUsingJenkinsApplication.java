package com.Jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BuildingDockerImageUsingJenkinsApplication {
	@GetMapping("/hello")
     public String Hello() {
		return "hello jenkins";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(BuildingDockerImageUsingJenkinsApplication.class, args);
	}

}
