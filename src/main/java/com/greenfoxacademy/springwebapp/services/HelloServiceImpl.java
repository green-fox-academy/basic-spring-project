package com.greenfoxacademy.springwebapp.services;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

  public String getHelloWorld() {
    return "Hello World!";
  }
}
