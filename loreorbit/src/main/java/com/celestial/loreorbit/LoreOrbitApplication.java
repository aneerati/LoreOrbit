package com.celestial.LoreoOrbit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@SpringBootApplication
public class LoreOrbitApplication {

	@RequestMapping("/")
	String home() {
		return "Something happened a long time ago";
	}

	public static void main(String[] args) {
		SpringApplication.run(LoreOrbitApplication.class, args);
	}

}
