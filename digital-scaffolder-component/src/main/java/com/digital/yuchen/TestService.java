package com.digital.yuchen;

import org.springframework.stereotype.Service;

@Service
public class TestService {

	public String hello(String msg) {
		return "Hello " + msg;
	}
}
