package com.example.demo.service;

import com.example.demo.Employee;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface EmployeeService  {

    Employee createEmployee(Employee employee)   ;
    List<Employee> readEmployees();

    boolean deleteEmployee(Long id);

    Employee updateEmployee(Employee employee);




}
