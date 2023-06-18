package com.advait.graphqlapi.controller;

import com.advait.graphqlapi.entity.Employee;
import com.advait.graphqlapi.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 This is a datafetcher class to for /graphql endpoint
 */

@Controller
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @QueryMapping
    public Flux<Employee> listEmployees(@Argument Integer page, @Argument Integer size) {
        PageRequest pageRequest = PageRequest.of(page, size);
        return Flux.fromIterable(employeeRepository.findAll(pageRequest));
    }

    @MutationMapping
    public Mono<Employee> addEmployee(@Argument Employee employeeInfo) {
        return Mono.just(employeeRepository.save(employeeInfo));
    }

    @MutationMapping
    public Mono<Employee> updateEmployee(@Argument Employee employeeInfo) {
        return Mono.just(employeeRepository.save(employeeInfo));
    }

    @MutationMapping
    public Mono<String> removeEmployee(@Argument String employeeId) {
        try {
            employeeRepository.deleteById(Integer.parseInt(employeeId));
            return Mono.just("Employee Id " + employeeId + " has been removed from the company's repository");
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

}
