package com.ServiceRegistry.SRServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SrServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SrServerApplication.class, args);
	}
}
