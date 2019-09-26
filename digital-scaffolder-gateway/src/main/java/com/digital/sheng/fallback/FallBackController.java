package com.digital.sheng.fallback;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {
	
	@RequestMapping(value = "/fallbackcontroller")
	public Map<String, String> fallBackController() {
	    Map<String, String> res = new HashMap<>();
	    res.put("code", "-100");
	    res.put("data", "service not available");
	    return res;
	}
}
