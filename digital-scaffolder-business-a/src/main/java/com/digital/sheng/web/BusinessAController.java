package com.digital.sheng.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.SpringClientFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.digital.sheng.facade.BusinessBFacade;
import com.digital.yuchen.HelloService;
import com.digital.yuchen.TestService;

@RestController
public class BusinessAController {

	@Autowired
	private SpringClientFactory springClientFactory;
	
	@Autowired
	private BusinessBFacade businessBFacade;
	
	@Autowired
	private TestService testService;
	
	@Autowired
	private HelloService helloDigitalService;
	
	@Autowired
	private HelloService helloWorldService;
	
	@Resource(name = "helloWorldService")
	private HelloService helloWorld2Service;
	
	@Autowired
	private HelloService[] helloList;
	
	@Autowired
	private List<HelloService> helloList2;
	
	@GetMapping("/hello/{msg}")
	public String hello(@PathVariable("msg") String msg) {
		return "Hello I am business A msg is " + businessBFacade.hello(msg);
	}
}
