package com.digital.yuchen.impl;

import org.springframework.stereotype.Component;

import com.digital.yuchen.HelloService;

@Component
public class HelloDigitalService implements HelloService {

	public String say() {
		return "Hello Digital!";
	}

}
