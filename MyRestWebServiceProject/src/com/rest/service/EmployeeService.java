package com.rest.service;

import com.rest.model.Employee;

public interface EmployeeService {

	public boolean add(Employee e);
	public boolean delete(int id);
	public Employee get(int id);
	public Employee[] getAll();
}
