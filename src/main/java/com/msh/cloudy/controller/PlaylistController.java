package com.msh.cloudy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PlaylistController {

	@GetMapping("/test")
	public String testHello() {
		System.out.println("In Test Method");
		return "Welcome to Cloudify";
		
	}
}
