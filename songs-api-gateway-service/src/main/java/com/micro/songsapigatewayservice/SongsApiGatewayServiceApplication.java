package com.micro.songsapigatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SongsApiGatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SongsApiGatewayServiceApplication.class, args);
	}

}
