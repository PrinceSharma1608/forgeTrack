package com.tata.Machine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MachineApplication {

	public static void main(String[] args) {
		SpringApplication.run(MachineApplication.class, args);
	}

}
