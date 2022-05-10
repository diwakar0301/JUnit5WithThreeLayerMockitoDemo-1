package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.ServiceInterface1;

@RestController
public class HomeController {
	
	@Autowired
	private ServiceInterface1 serviceInterface1;
	
	@GetMapping("home")
	public String homeCheck() {System.out.println("hello HOME");return "hello HOME";}
	@GetMapping("home1")
	public String ret() throws Exception{
		return serviceInterface1.ret();
	}
	
	public int add(int a,int b) throws Exception{
		return serviceInterface1.add(a, b);
	}
}
