package com.example.employees.services;

import com.example.employees.model.Employee;
import com.example.employees.repositories.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class EmployeeServiceImpl implements EmployeeService {

  private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeServiceImpl.class);

  @Autowired
  private EmployeeRepository employeeRepository;

  @Override
  public List<Employee> getEmployees() {
    return StreamSupport.stream(employeeRepository.findAll().spliterator(), false)
        .collect(Collectors.toList());
  }

  @Override
  public Optional<Employee> getEmployee(int id) {
    Optional<Employee> employee = employeeRepository.findById(id);
    employee.ifPresent(emp -> LOGGER.info("Employee with id={} was found", id));
    return employee;
  }
}
