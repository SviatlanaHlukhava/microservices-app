package com.example.employees.services;

import com.example.employees.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

  List<Employee> getEmployees();

  Optional<Employee> getEmployee(int id);
}
