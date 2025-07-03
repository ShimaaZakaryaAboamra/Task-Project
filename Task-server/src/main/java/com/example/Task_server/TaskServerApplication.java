package com.example.Task_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableDiscoveryClient
@SpringBootApplication
@EntityScan(basePackages = "com.example.Task_server.model")
@EnableJpaRepositories(basePackages = "com.example.Task_server.repository")
public class TaskServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskServerApplication.class, args);
	}
}
