package com.example.ldydo.discovery.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DiscoveryDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryDemoApplication.class, args);
	}
}
