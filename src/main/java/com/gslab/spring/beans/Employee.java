package com.gslab.spring.beans;

import java.util.List;
import java.util.Set;

public class Employee {

	private int id;
	private String name;
	private double salary;
	private String designation;
	private List<Address> address;
	private Set<String> skills;
	
	public void init() {
		System.out.println("inside init method");
	}
	
	public void destory() {
		System.out.println("inside destory method");
	}
	
	public Employee() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public Set<String> getSkills() {
		return skills;
	}

	public void setSkills(Set<String> skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation
				+ ", address=" + address + ", skills=" + skills + "]";
	}
	
	
	
	
}
