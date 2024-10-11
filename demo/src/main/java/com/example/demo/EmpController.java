package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmpController {

    @GetMapping("employees")
    public List<Employee > getAllEmployess(){
        List<Employee> employees = new ArrayList<>();
        Employee emp = new Employee();
        emp.setName("Shivam");
        emp.setPhone("03028170174");
        emp.setEmail("harisabdullah2547@gmail.com");
        employees.add(emp);
        return employees;
    }



}
