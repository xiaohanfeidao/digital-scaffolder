package com.digital.sheng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableCircuitBreaker
// @ImportResource({"classpath:/sample.xml"})
// @ComponentScan("com.digital.yuchen")
public class BusinessApp 
{
    public static void main( String[] args )
    {
        ConfigurableApplicationContext app = SpringApplication.run(BusinessApp.class, args);
        String[] beanDefinitionNames = app.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
			System.out.println(name);
		}
    }
}
