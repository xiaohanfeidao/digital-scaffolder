package com.digital.sheng.config;

import static org.springframework.cloud.gateway.support.ServerWebExchangeUtils.GATEWAY_REQUEST_URL_ATTR;
import static org.springframework.cloud.gateway.support.ServerWebExchangeUtils.GATEWAY_SCHEME_PREFIX_ATTR;

import java.net.URI;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

public class BroadcastFilter implements GlobalFilter, Ordered {

	@Override
	public int getOrder() {
		return (Ordered.LOWEST_PRECEDENCE - 1);
	}

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		URI url = exchange.getAttribute(GATEWAY_REQUEST_URL_ATTR);
		String schemePrefix = exchange.getAttribute(GATEWAY_SCHEME_PREFIX_ATTR);
		if (url == null
				|| (!"broadcast".equals(url.getScheme()) && !"broadcast".equals(schemePrefix))) {
			return chain.filter(exchange);
		}
		
		// 处理逻辑
		return exchange.getResponse().setComplete();
	}

}
