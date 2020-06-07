package com.gslab.spring.SpringLearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gslab.spring.beans.Employee;

/**
 * Hello world!
 *
 */
//@ImportResource({ "classpath:config/xml/application.xml" })
public class App 
{
//	@Autowired
//	private static Employee employee;
	
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext content = new ClassPathXmlApplicationContext("config/xml/application.xml");
    	
    	Employee employee = (Employee) content.getBean("employee");
    	System.out.println("id ="+employee.getId());
    	System.out.println("name ="+employee.getName());
    	System.out.println("salary ="+employee.getSalary());
    	System.out.println("designation ="+employee.getDesignation());
    	System.out.println("address ="+employee.getAddress().getPincode());
    }
}
