package com.example.greeting.services;

import com.example.greeting.model.Employee;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class GreetingServiceImpl implements GreetingService {

  private static final String EMPLOYEE_NOT_FOUND = "Employee was not found";

  @Value("${message.greeting:Hi}")
  private String message;

  @Autowired
  private RestTemplate restTemplate;

  @Override
  @HystrixCommand(fallbackMethod = "defaultGreeting")
  public String getGreeting(int id) {
    final Employee employee = restTemplate.getForObject("http://employees/employees/" + id, Employee.class);
    return Optional.ofNullable(employee).map(person -> message + ' ' + person.getFirstName())
        .orElse(defaultGreeting(id));
  }

  private String defaultGreeting(int id){
    return EMPLOYEE_NOT_FOUND;
  }
}
