package com.in28mins.springboot.todoApp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	
	@GetMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello from SPring Boot!";
	}
	
	@GetMapping("say-hello-jsp")
	public String sayHelloJsp() {
		return "sayHello";
	}
	
}
