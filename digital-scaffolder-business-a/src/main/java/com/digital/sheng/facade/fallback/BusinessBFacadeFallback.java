package com.digital.sheng.facade.fallback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.digital.sheng.facade.BusinessBFacade;

import feign.hystrix.FallbackFactory;

@Component
public class BusinessBFacadeFallback implements FallbackFactory<BusinessBFacade> {

	private static final Logger log =LoggerFactory.getLogger(BusinessBFacadeFallback.class);
	
	public BusinessBFacade create(final Throwable arg0) {
		return new BusinessBFacade() {

			public String hello(String msg) {
				log.error("BusinessBFacadeFallback is error, {}", arg0.getMessage(), arg0);
				return "Hello It's Fallback";
			}
		};
	}

}
