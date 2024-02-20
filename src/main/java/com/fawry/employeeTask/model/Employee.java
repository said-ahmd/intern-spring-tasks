package com.fawry.employeeTask.model;

import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;


    @ManyToOne
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;


    public Employee() {

    }
    public Employee(String name, Long department_id) {
        this.name = name;
        this.department = new Department();
        this.department.setId(department_id);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
