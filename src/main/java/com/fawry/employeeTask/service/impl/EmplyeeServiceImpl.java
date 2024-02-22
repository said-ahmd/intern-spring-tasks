package com.fawry.employeeTask.service.impl;

import com.fawry.employeeTask.model.Employee;
import com.fawry.employeeTask.repository.EmployeeRepository;
import com.fawry.employeeTask.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmplyeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmplyeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return this.employeeRepository.findAll();
    }

    @Override
    public Page<Employee> getAllEmployees(Pageable pageable) {
        return employeeRepository.findAll(pageable);
    }


    @Override
    public Optional<Employee> getEmployeeById(Long id) {
        return this.employeeRepository.findById(id);
    }

    @Override
    public List<Employee> getEmployeesByDepartmentId(Long id) {
        return this.employeeRepository.findByDepartment_Id(id);
    }

    @Override
    public void createNewEmployee(Employee employee) {
        this.employeeRepository.save(employee);
    }

    @Override
    public Page<Employee> searchEmployees(String name, Pageable pageable) {
        return employeeRepository.findByNameContainingIgnoreCase(name, pageable);
    }

}
