package com.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping
	public String something() {
		return "Hi Welcoming to the Easy learning Channellllllllllllllllll......";
	}
}
