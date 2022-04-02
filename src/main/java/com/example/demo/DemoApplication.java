package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args); /*Spring sucht alle Methoden bei dennen Bean davorsteht*/
	}

	@Bean
	public CommandLineRunner run(UserRepo userRepo){ /*Wird hier am Anfang der Application ausgeführt (Testdaten)*/
		return (x) -> {
			User user = new User();
			user.name = "Nico";
			userRepo.save(user);
			User memory = userRepo.findByName("Nico");
			System.out.println(memory.name);
		};
	}
}
