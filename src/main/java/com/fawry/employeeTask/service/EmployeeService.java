package com.fawry.employeeTask.service;

import com.fawry.employeeTask.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    public List<Employee> getAllEmployees();

    public Page<Employee> getAllEmployees(Pageable pageable);
    public Optional<Employee> getEmployeeById(Long id);
    public List<Employee> getEmployeesByDepartmentId(Long id);
    public void createNewEmployee(Employee employee);
    Page<Employee> searchEmployees(String name, Pageable pageable);



}
