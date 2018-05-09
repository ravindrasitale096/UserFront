package com.userfront;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserFrontApplication {

	public static void main(String[] args) {

		System.getProperties().put( "server.port", 6001 );
		SpringApplication.run(UserFrontApplication.class, args);
	}
}
