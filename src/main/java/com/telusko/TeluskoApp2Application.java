package com.telusko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TeluskoApp2Application {

	public static void main(String[] args) {
		SpringApplication.run(TeluskoApp2Application.class, args);
	}

}
