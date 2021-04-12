package com.jbk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod;

import com.jbk.entity.Employee;
import com.jbk.entity.User;
import com.jbk.service.EmpService_i;

@Controller
public class Webcontroller {

	@Autowired
	EmpService_i service;

	@RequestMapping("/")
	public String show() {

		return "login";
	}

	@RequestMapping(path = "/logindata")
	public String logincheck(@RequestParam("username") String username, @RequestParam("password") String password,
			Model model) {

		List<Employee> elist = service.logincheck(username, password);

		for (Employee e : elist) {
			String role = e.getRole();
			System.out.println(role);

			if ("admin".equalsIgnoreCase(role)) {

				List<Employee> alllist = service.getallemp();

				model.addAttribute("alllist", alllist);

				return "home";
			} else {
			
			
				model.addAttribute("alllist", elist);

				return "emp-home";
			}

		}

		return "login";
	}

	@RequestMapping(path = "/updateForm")
	public String updateform(@RequestParam("employeeId") int id, Model model) {
		System.out.println(id);
		Employee employee = service.getempbyid(id);

		model.addAttribute("employee", employee);

		return "addemp";
	}

	@RequestMapping(path = "/saveCustomer")
	public String saveorupdateemp(@ModelAttribute Employee employee, Model model) {

		service.saveorupdate(employee);
		List<Employee> alllist = service.getallemp();

		model.addAttribute("alllist", alllist);

		return "home";
	}

	@RequestMapping(path = "/saveemp")
	public String saveemployee(Model model) {
		Employee employee = new Employee();
		model.addAttribute("employee", employee);

		return "addemp";
	}

	@RequestMapping(path = "/delete")
	public String deleteemp(@RequestParam("customerId") int id, Model model) {

		service.deleteemp(id);

		return "redirect:/saveCustomer";
	}

	// @RequestMapping(path="/logindata")
	// public String logincheck(@ModelAttribute User user,Model model) {
	//
	// System.out.println(user);
	// model.addAttribute("user", user);
	//
	// return "home";
	// }
}
