package com.example.laboratorio3.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "employees")
public class Employees {

    @Id
    private String employeeId;
    @Column(nullable=false)
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    @Column(nullable=false)
    private Date hireDate;
    @ManyToOne
    @JoinColumn(name = "job_id")
    private Jobs jobs;
    private Float salary;
    private Float commissionPct;
    @ManyToOne
    @JoinColumn(name="manager_id")
    private Employees manager;


}
