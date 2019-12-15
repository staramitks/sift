package com.sift.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SIFTController {
	
	@GetMapping("/test")
	public String getName()
	{
		return "Check Test Hello World";
	}

	@GetMapping("/")
	public String getHome()
	{
		return "index";
	}
}
