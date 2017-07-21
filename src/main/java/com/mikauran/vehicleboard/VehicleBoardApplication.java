package com.mikauran.vehicleboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.mikauran.vehicleboard.repository")
public class VehicleBoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(VehicleBoardApplication.class, args);
	}
	
	public void run() {
	}
}
