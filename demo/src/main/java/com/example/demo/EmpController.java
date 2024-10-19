package com.example.demo;

import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmpController {
    //List<Employee> employees = new ArrayList<>();


    @Autowired
    EmployeeService employeeService ;

    @GetMapping("employees")
    public List<Employee> getAllEmployess() {
        return employeeService.readEmployees();
    }
    @PostMapping("employees")
    public String createEmployee(@RequestBody Employee employee) {
//        employees.add(employee);
        employeeService.createEmployee(employee);
        return "success";
    }

    @DeleteMapping("employees/{id}")
    public boolean deleteEmployee(@PathVariable Long id){
        employeeService.deleteEmployee(id);
        return true;
    }


}
