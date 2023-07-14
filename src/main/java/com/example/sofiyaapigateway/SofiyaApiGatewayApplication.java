package com.example.sofiyaapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SofiyaApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SofiyaApiGatewayApplication.class, args);
	}

}
