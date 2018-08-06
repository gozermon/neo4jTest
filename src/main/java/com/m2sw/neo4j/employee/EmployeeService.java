package com.m2sw.neo4j.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service class called by the Controller.  We don't really need this layer for a simple example as the controller could
 * call the respotiroy directly but it is a good practice.
 * Normally, we would have methods here to do some simple orchestration fo aggregation of multiple query resuults.
 */
@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    /**
     * Get the list of all employees.
     * TODO This should use paging in EmployeeRepository and pass it back here.
     *
     * @return List of employee objects
     */
    Iterable<Employee> listAllEmployees() {
        return employeeRepository.findAll();
    }

    /**
     * Save the specified employee
     *
     * @param empId - employee id
     * @param name  - employee name
     */
    void createEmployee(int empId, String name) {
        Employee employee = new Employee(empId, name);
        employeeRepository.save(employee);
    }

}
