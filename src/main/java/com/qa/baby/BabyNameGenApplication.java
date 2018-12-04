package com.qa.baby;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.qa.baby.util.generators.NameGenerator;

@SpringBootApplication
public class BabyNameGenApplication {

	public static void main(String[] args) {
		SpringApplication.run(BabyNameGenApplication.class, args);
	}


	@Bean
	public NameGenerator nameGenerator(){
		return new NameGenerator();
	}

}


