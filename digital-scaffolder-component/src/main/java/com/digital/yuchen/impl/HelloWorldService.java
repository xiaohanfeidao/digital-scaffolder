package com.digital.yuchen.impl;

import org.springframework.stereotype.Component;

import com.digital.yuchen.HelloService;

@Component
public class HelloWorldService implements HelloService {

	public String say() {
		return "Hello World!";
	}

}
