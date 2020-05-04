package com.example.greeting.services;

import com.example.greeting.configuration.MessageConfiguration;
import com.example.greeting.model.Employee;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class GreetingServiceImpl implements GreetingService {

  private static final String EMPLOYEE_NOT_FOUND = "Employee was not found";
  private static final Logger LOGGER = LoggerFactory.getLogger(GreetingServiceImpl.class);

  @Autowired
  private MessageConfiguration messageConfiguration;

  @Autowired
  private RestTemplate restTemplate;

  @Override
  @HystrixCommand(fallbackMethod = "greetingFallback")
  public String getGreeting(int id) {
    final Employee employee = restTemplate.getForObject("http://employees/employees/" + id, Employee.class);
    return Optional.ofNullable(employee).map(person -> messageConfiguration.getGreeting() + ' ' + person.getFirstName())
        .orElse(defaultGreeting(id));
  }

  private String defaultGreeting(int id) {
    LOGGER.info("Employee with id={} was not found", id);
    return EMPLOYEE_NOT_FOUND;
  }

  private String greetingFallback(int id) {
    LOGGER.error("Could not get employee with id={}", id);
    return EMPLOYEE_NOT_FOUND;
  }
}
