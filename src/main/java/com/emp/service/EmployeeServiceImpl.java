package com.emp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.emp.entity.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService{
	
	// Dummy Employee List
	List<Employee> list = List.of(
			
			new Employee(1311L,"Peter Parker","98846753"),
			new Employee(1312L,"Sudheer","988246753"),
			new Employee(1313L,"Mahesh","988446753"),
			new Employee(1314L,"Hareesh","988436753"),
			new Employee(1315L,"John","988465753"),
			new Employee(1316L,"Keerthi","988466753"),
			new Employee(1317L,"Sony","988467573")
			
			);
	
	@Override
	public Employee getEmployee(Long id) {
		// ToDo Auto generate method Stud
		return list.stream().filter(employee -> employee.getId().equals(id)).findAny().orElse(null);
	}
	
	
	
	
	
	
	
}
