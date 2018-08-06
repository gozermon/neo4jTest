package com.m2sw.neo4j.employee;

import io.swagger.annotations.ApiModelProperty;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * POJO to hold the employee data
 */
@NodeEntity
public class Employee {
    @Id
    @GeneratedValue
    Long id;
    @ApiModelProperty(notes = "The employee id", required = true)
    int empId;
    @ApiModelProperty(notes = "The employee name", required = true)
    String name;

    // Empty constructor required as of Neo4j API 2.0.5
    public Employee() {
    }

    public Employee(int empId, String name) {

        this.empId = empId;
        this.name = name;
    }

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
