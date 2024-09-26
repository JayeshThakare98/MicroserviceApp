package com.serviceRegistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServicerRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicerRegistryApplication.class, args);
	}

}
