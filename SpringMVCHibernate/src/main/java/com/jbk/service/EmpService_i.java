package com.jbk.service;

import java.util.List;

import com.jbk.entity.Employee;

public interface EmpService_i {

	List<Employee> logincheck(String username, String password);

	List<Employee> getallemp();

	Employee getempbyid(int id);

	void saveorupdate(Employee employee);

	void deleteemp(int id);

}
