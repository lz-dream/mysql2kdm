package com.hpi.mysql2kdm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Mysql2kdmApplication {

	public static void main(String[] args) {
		SpringApplication.run(Mysql2kdmApplication.class, args);
	}

}

