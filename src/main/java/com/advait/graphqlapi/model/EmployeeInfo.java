package com.advait.graphqlapi.model;

import lombok.Data;

@Data
public class EmployeeInfo {

    private String name;

    private String addressLine1;

    private String addressLine2;

    private String contact;

    private String department;

    private Integer salary;
}
