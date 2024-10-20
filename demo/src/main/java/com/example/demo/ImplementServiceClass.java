package com.example.demo;

import com.example.demo.service.EmployeeService;

import java.util.ArrayList;
import java.util.List;

public class ImplementServiceClass implements EmployeeService {

    List<Employee> employees = new ArrayList<>();
    @Override
    public Employee createEmployee(Employee employee) {
        employees.add(employee);
        return employee;
    }

    @Override
    public List<Employee> readEmployees() {
        return employees;
    }

    @Override
    public boolean deleteEmployee(Long id) {
        employees.remove(id);
        return true;
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return null;
    }
}
