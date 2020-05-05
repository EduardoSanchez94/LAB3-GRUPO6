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
}
