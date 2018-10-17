package com.ServiceRegistry.SRClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SrClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SrClientApplication.class, args);
	}
	
	
	
}
