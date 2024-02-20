package com.fawry.employeeTask.controller;

import com.fawry.employeeTask.model.Employee;
import com.fawry.employeeTask.service.EmployeeService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    private EmployeeService employeeService;

    EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping("/AllEmployees")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }
    @GetMapping("/employee/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable Long id){
        return employeeService.getEmployeeById(id);
    }

    @GetMapping("department/{id}")
    public List<Employee> getEmployeeByDepartmentId(@PathVariable Long id){
        return employeeService.getEmployeesByDepartmentId(id);
    }

    @PostMapping("create")
    public void createEmployee(@RequestParam String name, @RequestParam Long departmentId){
        employeeService.createNewEmployee(name, departmentId);
    }
    @GetMapping("/AllEmployeess")
    public Page<Employee> getAllEmployees(Pageable pageable) {
        return employeeService.getAllEmployees(pageable);
    }

    @GetMapping("/AllEmployees/search/{name}")
    Page<Employee> findByNameContaining(@PathVariable String name, Pageable pageable) {
        return employeeService.searchEmployees(name, pageable);
    }



}

