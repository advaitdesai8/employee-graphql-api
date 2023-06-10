package com.advait.graphqlapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
@Data
@AllArgsConstructor
public class Employee {

    @Id
    @Column(name = "Employee_Id")
    private Integer employeeId;

    @Column(name = "Name")
    private String name;

    @Column(name = "Address_Line1")
    private String addressLine1;

    @Column(name = "Address_Line2")
    private String addressLine2;

    @Column(name = "Contact")
    private String contact;

    @Column(name = "Department")
    private String department;

    @Column(name = "Salary")
    private Integer salary;

    @Column(name = "Ex_Employee")
    private boolean exEmployee;
}
