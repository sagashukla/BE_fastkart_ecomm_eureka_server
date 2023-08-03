package com.fastkart.ecomm.FastKartEcommEurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FastKartEcommEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FastKartEcommEurekaServerApplication.class, args);
	}

}
