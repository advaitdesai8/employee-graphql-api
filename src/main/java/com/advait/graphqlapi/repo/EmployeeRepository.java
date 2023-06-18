package com.advait.graphqlapi.repo;

import com.advait.graphqlapi.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.graphql.data.GraphQlRepository;

/**
 This interface is used for fetching data from underlying database
 */

@GraphQlRepository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Override
    Page<Employee> findAll(Pageable pageable);
}
