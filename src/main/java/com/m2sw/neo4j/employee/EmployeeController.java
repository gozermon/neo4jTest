package com.m2sw.neo4j.employee;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller that process the employee nodes.
 */
@RestController
@RequestMapping("/employees")
@Api(value = "neo4jtest", description = "Operations on the employees in the Neo4j test api")
public class EmployeeController {


    private EmployeeService employeeService;

    @Autowired
    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    /**
     * Return all employess in the database.
     * TODO Add paging later
     *
     * @return List of employee objects
     */
    @ApiOperation(value = "View a list of all the employees", response = Iterable.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved the list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")}
    )
    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Iterable<Employee>> getAllEmployees() {
        Iterable<Employee> employeeList = employeeService.listAllEmployees();
        return new ResponseEntity<>(employeeList, HttpStatus.OK);
    }

    /**
     * Save a single e,ployee in the database.
     * TODO Add duplicate return check and throw/return an error
     *
     * @param emp_id - the unique employee id
     * @param name   - The name of the employee
     * @return Success message on success
     */
    @ApiOperation(value = "Add a new employee to the database", response = String.class)
    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "text/plain")
    public ResponseEntity<String> createEmployee(int emp_id, String name) {
        employeeService.createEmployee(emp_id, name);
        return new ResponseEntity<>("Employee saved successfully", HttpStatus.OK);
    }
}
