package com.fawry.employeeTask.service;

import com.fawry.employeeTask.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public Optional<Employee> getEmployeeById(Long id);
    public List<Employee> getEmployeesByCategory(String c);
}
