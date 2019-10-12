package com.digital.sheng.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BusinessBController {

	@GetMapping("/hello/{msg}")
	public String hello(@PathVariable("msg") String msg) {
		
		return "Hello I am business B msg is " + msg;
	}
}
