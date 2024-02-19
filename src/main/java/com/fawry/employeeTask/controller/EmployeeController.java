package com.fawry.employeeTask.controller;

import com.fawry.employeeTask.model.Employee;
import com.fawry.employeeTask.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {
    private EmployeeService employee;

    @Autowired
    EmployeeController(EmployeeService employee){
        this.employee=employee;
    }
    @GetMapping("/AllEmployees")
    public List<Employee> getAllEmployees(){
        return employee.getAllEmployees();
    }
    @GetMapping("/employee/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable Long id){
        return employee.getEmployeeById(id);
    }

//    @GetMapping("employees/{category}")
//    public Optional<List<Employee>> getEmployeeByCategory(@PathVariable String category){
//        return employee.getEmployeesByCategory(category);
//    }

    @GetMapping("employeess/{c}")
    public List<Employee> getEmployeeBy(@PathVariable String c){
        return employee.getEmployeesByCategory(c);
    }
}

