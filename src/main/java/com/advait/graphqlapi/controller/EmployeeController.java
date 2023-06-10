package com.advait.graphqlapi.controller;

import com.advait.graphqlapi.model.Employee;
import com.advait.graphqlapi.model.EmployeeInfo;
import com.advait.graphqlapi.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @QueryMapping
    public Flux<Employee> listEmployees(@Argument Integer page, @Argument Integer size) {
        return Flux.fromIterable(new ArrayList<Employee>());
    }

    @MutationMapping
    public Mono<Employee> addEmployee(@Argument EmployeeInfo employeeInfo) {
        Employee employee = new Employee(null, employeeInfo.getName(), employeeInfo.getAddressLine1(), employeeInfo.getAddressLine2(), employeeInfo.getContact(), employeeInfo.getDepartment(), employeeInfo.getSalary(), false);
        return Mono.just(employeeRepository.save(employee));
    }
}
