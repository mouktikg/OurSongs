package com.micro.oursongsdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class OurSongsDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(OurSongsDiscoveryApplication.class, args);
	}

}
