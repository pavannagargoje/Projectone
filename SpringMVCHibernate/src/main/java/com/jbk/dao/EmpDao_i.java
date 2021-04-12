package com.jbk.dao;

import java.util.List;

import com.jbk.entity.Employee;

public interface EmpDao_i {

	List<Employee> logincheck(String username, String password);

	List<Employee> getallemp();

	Employee getempbyid(int id);

	void saveorupdate(Employee employee);

	void deleteemp(int id);

}
