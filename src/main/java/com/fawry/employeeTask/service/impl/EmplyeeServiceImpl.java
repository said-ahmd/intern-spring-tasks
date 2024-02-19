package com.fawry.employeeTask.service.impl;

import com.fawry.employeeTask.model.Employee;
import com.fawry.employeeTask.repository.EmployeeRepository;
import com.fawry.employeeTask.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmplyeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmplyeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return this.employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> getEmployeeById(Long id) {
        return this.employeeRepository.findById(id);
    }


    @Override
    public List<Employee> getEmployeesByCategory(String c) {
        return this.employeeRepository.findByCategory(c);
    }
}
