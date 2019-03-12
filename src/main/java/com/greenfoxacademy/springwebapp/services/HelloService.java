package com.greenfoxacademy.springwebapp.services;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String getHelloWorld(){
        return "Hello World!";
    }
}
