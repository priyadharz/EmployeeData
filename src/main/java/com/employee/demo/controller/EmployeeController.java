package com.employee.demo.controller;

import com.employee.demo.model.Employee;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/employee")
public class EmployeeController {

  @RequestMapping(path="/test")
  @GetMapping
  public List<Employee> fetchDetails() {
    List<Employee> employees = new ArrayList<>();
    employees.add(
        Employee.builder()
            .name("user1")
            .designation("associate")
            .salary(BigDecimal.valueOf(10000))
            .build());
    employees.add(
        Employee.builder()
            .name("user2")
            .designation("seniorAssociate")
            .salary(BigDecimal.valueOf(20000))
            .build());
    employees.add(
        Employee.builder()
            .name("user3")
            .designation("Manager")
            .salary(BigDecimal.valueOf(100000))
            .build());
    return employees;
  }
}
