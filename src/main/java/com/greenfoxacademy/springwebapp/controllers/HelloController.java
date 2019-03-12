package com.greenfoxacademy.springwebapp.controllers;

import com.greenfoxacademy.springwebapp.services.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

  private HelloService helloService;

  public HelloController(HelloService helloService){
    this.helloService = helloService;
  }

  @GetMapping("/hello")
  public String helloWorld() {
    return helloService.getHelloWorld();
  }
}
