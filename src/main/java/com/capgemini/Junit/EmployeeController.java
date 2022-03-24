package com.capgemini.Junit;

public class EmployeeController {

	private final EmployeeService employeeService;
	
	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	public String createEMployee() {
		return employeeService.createEMployee(); 
	}
	
	public int updateEmployee() throws Exception {
		return employeeService.updatingEMployee();
	}
}

