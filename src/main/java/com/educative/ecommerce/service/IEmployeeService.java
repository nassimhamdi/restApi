package com.educative.ecommerce.service;

import com.educative.ecommerce.model.Employee;

public interface IEmployeeService {

	 void AddEmployee(Employee employee);
	 
	 Employee getEmployeeById(long employeeId);
	 
     void updateEmployee(Employee employee);
     
     void deleteEmployee(long employeeId);
}
