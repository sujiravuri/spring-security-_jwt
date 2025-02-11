package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DemoController {

    @GetMapping("/msg")
  public String getMessage()
  {
      return "Hello World";
  }

  @GetMapping("/contact")
  public String getcontactinfo()
  {
     return "call this Number";
  }
    @GetMapping("/greet")
    public String getGreet()
    {
        return "Good Morning";
    }
    @GetMapping("/welcome")
    public String getWelcome()
    {
        return "Welcome to this world";
    }
}
