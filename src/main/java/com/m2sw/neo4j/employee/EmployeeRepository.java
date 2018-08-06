package com.m2sw.neo4j.employee;

import org.springframework.data.neo4j.repository.Neo4jRepository;

/**
 * Spring Data repositoryu for the employee nodes.
 */
public interface EmployeeRepository extends Neo4jRepository<Employee, Long> {
    // Nothing needed, Spring Data handles all of the basic methods for us
}

