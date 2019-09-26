package com.digital.sheng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DigitalScaffolderEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigitalScaffolderEurekaApplication.class, args);
	}

}
