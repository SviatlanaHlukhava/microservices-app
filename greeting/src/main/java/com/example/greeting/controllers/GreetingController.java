package com.example.greeting.controllers;

import com.example.greeting.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

  @Autowired
  private GreetingService greetingService;

  @GetMapping("/{id}/greeting")
  public String getGreeting(@PathVariable Integer id) {
    return greetingService.getGreeting(id);
  }
}
