package com.jbk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jbk.dao.EmpDao_i;
import com.jbk.entity.Employee;

@Transactional
@Service
public class EmpService_impl implements EmpService_i {
	
	@Autowired
	EmpDao_i dao;

	@Override
	public List<Employee> logincheck(String username, String password) {
		
		
		
				return dao.logincheck(username,password);
		
	}

	@Override
	public List<Employee> getallemp() {
		
		List<Employee> alllist=dao.getallemp();
		
		return alllist;
	}

	@Override
	@Transactional
	public Employee getempbyid(int id) {
		Employee employee=dao.getempbyid(id);
		return employee;
	}

	@Override
	@Transactional
	public void saveorupdate(Employee employee) {
		dao.saveorupdate(employee);
		
	}

	@Override
	@Transactional
	public void deleteemp(int id) {
		dao.deleteemp(id);
		
	}

}
