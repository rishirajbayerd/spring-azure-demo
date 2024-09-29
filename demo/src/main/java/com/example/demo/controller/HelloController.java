package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.HelloService;

@RestController
@RequestMapping("/api")


public class HelloController {
	@Autowired
	HelloService helloService;

     
    @GetMapping("/hello")
    public String sayHello() {
        return helloService.getHelloMessage();
    }
}
