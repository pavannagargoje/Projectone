package com.jbk.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table
public class Employee {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;
    
    @Column(name="mobileno")
    private String mobileno;
    
    @Column(name="designation")
    private String designation;
    
    @Column(name="role")
    private String role;

   
    public Employee() {
		// TODO Auto-generated constructor stub
	}


	public Employee(int id, String username, String password, String email, String mobileno, String designation,
			String role) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.mobileno = mobileno;
		this.designation = designation;
		this.role = role;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMobileno() {
		return mobileno;
	}


	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", mobileno=" + mobileno + ", designation=" + designation + ", role=" + role + "]";
	}
    
    
    
}
