package com.example.laboratorio3.entity;

import javax.persistence.*;

@Entity
@Table(name = "departments")
public class Department {
    @Id
    private int department_id;
    private String department_name;
    @ManyToOne
    @JoinColumn(name = "emmployee_id")
    private Employees manager;
    @ManyToOne
    @JoinColumn(name = "location_id")
    private Locations location_id;

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public Employees getManager() {
        return manager;
    }

    public void setManager(Employees manager) {
        this.manager = manager;
    }

    public Locations getLocation_id() {
        return location_id;
    }

    public void setLocation_id(Locations location_id) {
        this.location_id = location_id;
    }
}
