package com.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ZuulDemoServerApplication {

	@RequestMapping("/available")
	public String available() {
		return "Available!";
	}

	@RequestMapping("/checked-out")
	public String checkedOut() {
		return "Checked out!";
	}

	public static void main(String[] args) {
		SpringApplication.run(ZuulDemoServerApplication.class, args);
	}
}
