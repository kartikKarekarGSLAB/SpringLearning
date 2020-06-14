package com.gslab.spring.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfiguration {

	@Bean(initMethod = "init", destroyMethod = "destory")
	public Employee getStudent() {
		Employee emp = new Employee();
		emp.setName("Shivaji");
		emp.setDesignation("Lead sofware engineer");
		emp.setId(1002);
		return emp;
	}
	
}
