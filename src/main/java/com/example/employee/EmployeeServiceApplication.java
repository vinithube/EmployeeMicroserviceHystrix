package com.example.employee;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RequestMapping("/emp")
@RestController
public class EmployeeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceApplication.class, args);
	}

	@Value("${server.port}")
	private String port;

	@GetMapping("/empDetail")
	public String getEmployee(){
		return "Vinod Thube";
	}

	@GetMapping("/getServerPort")
	public String getPort(){
		return "Application is up on Port :"+ port;
	}
}
