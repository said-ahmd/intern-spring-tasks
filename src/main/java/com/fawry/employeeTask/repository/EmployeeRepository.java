package com.fawry.employeeTask.repository;


import com.fawry.employeeTask.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.springframework.data.domain.Pageable;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
//    List<Employee> findByDepartmentId (Long department_id);

    List<Employee> findByDepartment_Id(Long id);

    Page<Employee> findAll(Pageable pageable);
    Page<Employee> findByNameContainingIgnoreCase(String name, Pageable pageable);
}