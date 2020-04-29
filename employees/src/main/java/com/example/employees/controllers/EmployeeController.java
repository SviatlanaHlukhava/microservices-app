package com.example.employees.controllers;

import com.example.employees.model.Employee;
import com.example.employees.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employees")
@RefreshScope
public class EmployeeController {

  @Autowired
  private EmployeeService employeeService;

  @GetMapping()
  public List<Employee> getEmployees() {
    return employeeService.getEmployees();
  }

  @GetMapping("/{id}")
  public Employee getEmployee(@PathVariable Integer id) {
    return employeeService.getEmployee(id).orElse(null);
  }
}
