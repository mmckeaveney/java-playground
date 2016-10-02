package com.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuuldemogatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuuldemogatewayApplication.class, args);
	}
}
