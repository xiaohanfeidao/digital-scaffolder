package com.digital.sheng.facade;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.digital.sheng.facade.fallback.BusinessBFacadeFallback;

@FeignClient(value = "digital-scaffolder-business-b",
	fallbackFactory=BusinessBFacadeFallback.class)
public interface BusinessBFacade {

	@GetMapping("/hello/{msg}")
	public String hello(@PathVariable("msg") String msg);
}
