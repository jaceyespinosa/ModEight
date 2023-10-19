package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Employee {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long empId;
    private String empName;
    private String empPosition;

    public Employee() {
    	super();
    }
    
    public Employee(Long empId, String empName) {
    	this.empId = empId;
    	this.empName = empName;
    }
    
    public Employee(String empName, String empPosition) {
    	this.empName = empName;
    	this.empPosition = empPosition;
    }

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpPosition() {
		return empPosition;
	}

	public void setEmpPosition(String empPosition) {
		this.empPosition = empPosition;
	}
}