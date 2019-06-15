package com.jenkings.JenkingsDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkingsController {

	@GetMapping("/index")
	public String index(){
		return "Hello,world!";
	}
}
