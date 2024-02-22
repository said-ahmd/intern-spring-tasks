package com.fawry.employeeTask.model;

import jakarta.persistence.*;

@Entity
@Table(name = "department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Department(){}
    public Department(Long id, String departmentName) {
        this.id = id;
        this.name = departmentName;
    }

    public String getDepartmentName() {
        return name;
    }
    public void setDepartmentName(String departmentName) {
        this.name = departmentName;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }
}
