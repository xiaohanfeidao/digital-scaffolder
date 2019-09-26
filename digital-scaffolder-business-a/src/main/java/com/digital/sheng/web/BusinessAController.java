package com.digital.sheng.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.SpringClientFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.digital.sheng.facade.BusinessBFacade;

@RestController
public class BusinessAController {

	@Autowired
	private SpringClientFactory springClientFactory;
	
	@Autowired
	private BusinessBFacade businessBFacade;
	
	@GetMapping("/hello/{msg}")
	public String hello(@PathVariable("msg") String msg) {
		return "Hello I am business A msg is " + businessBFacade.hello(msg);
	}
}
