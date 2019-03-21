package com.greenfoxacademy.springwebapp.hello;

import com.greenfoxacademy.springwebapp.services.HelloServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HelloServiceTest {

  private HelloServiceImpl helloService;

  @Before
  public void init() {
    helloService = new HelloServiceImpl();
  }

  @Test
  public void getHelloWorld_ValidExpectedValue_Equals() {
    Assert.assertEquals("Hello World!", helloService.getHelloWorld());
  }

  @Test
  public void getHelloWorld_InvalidExpectedValue_NotEquals() {
    Assert.assertNotEquals("Hello!", helloService.getHelloWorld());
  }
}
