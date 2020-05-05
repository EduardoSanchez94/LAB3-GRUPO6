package com.example.laboratorio3.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "employees")
public class Employees {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeId;


    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }


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


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Jobs getJobs() {
        return jobs;
    }

    public void setJobs(Jobs jobs) {
        this.jobs = jobs;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public Float getCommissionPct() {
        return commissionPct;
    }

    public void setCommissionPct(Float commissionPct) {
        this.commissionPct = commissionPct;
    }

    public Employees getManager() {
        return manager;
    }

    public void setManager(Employees manager) {
        this.manager = manager;
    }
}
