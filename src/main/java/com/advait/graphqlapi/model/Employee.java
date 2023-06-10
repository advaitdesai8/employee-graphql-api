package com.advait.graphqlapi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "employee")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee {

    @Id
    @GeneratedValue (strategy= GenerationType.SEQUENCE, generator="empSeqGen")
    @SequenceGenerator(name = "empSeqGen", sequenceName = "EMPLOYEE_ID_SEQ", allocationSize = 1)
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
