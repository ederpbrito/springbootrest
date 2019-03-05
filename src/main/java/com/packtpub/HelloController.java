package com.packtpub;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String initial(){
		return "Page initial jetty server!!";
	}
	
	@RequestMapping("/greet")
	public String hello(){
		return "Hello from jetty server";
	}
}
