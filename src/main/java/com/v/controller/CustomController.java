package com.v.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.v.properties.MyProperties;

@RestController
public class CustomController { 

	private MyProperties properties;

	public CustomController(MyProperties properties) {
		this.properties = properties;
	}

	@GetMapping("/")
	public String getData() {
		return properties.getFirstName();
	}
}