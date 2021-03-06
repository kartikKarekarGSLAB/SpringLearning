package com.gslab.spring.SpringLearning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gslab.spring.beans.Employee;
import com.gslab.spring.beans.EmployeeConfiguration;

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
    	//XML file based configuration.
    	ClassPathXmlApplicationContext content = new ClassPathXmlApplicationContext("config/xml/application.xml");
    	
    	Employee employee = (Employee) content.getBean("employee2");
    	System.out.println("id ="+employee.getId());
    	System.out.println("name ="+employee.getName());
    	System.out.println("salary ="+employee.getSalary());
    	System.out.println("designation ="+employee.getDesignation());
    	System.out.println("Implementation added default type for address ="+employee.getAddress().getClass().getName());
    	employee.getAddress().stream().forEach((address) -> {
    		System.out.println("pincode ::"+ address.getPincode() + ", TYPE="+address.getType());
    	});
    	
    	Employee employee2 = (Employee) content.getBean("employee2");
    	System.out.println("\nexisting object hash ::"+ employee.hashCode() +"\nother Object hash::"+ employee2.hashCode()+ "\n");
    	
    	System.out.println("Implmentation added default ::"+employee.getSkills().getClass().getName());
    	employee.getSkills().stream().forEach(System.out::println);
    	
    	
    	Employee empPropertySchema = (Employee) content.getBean("empPropertySchema");
    	System.out.println("\n\nBean initalize using properties schema ::"+empPropertySchema+"\n\n");
    	
    	Employee empconstructor = (Employee) content.getBean("empconstructor");
    	System.out.println("\n\nBean initalize using constructor ::"+empconstructor+"\n\n");
    	
    	Employee empConstructorSchema = (Employee) content.getBean("empConstructorSchema");
    	System.out.println("\n\nBean initalize using constructor schema ::"+empConstructorSchema+"\n\n");
    	
    	content.registerShutdownHook();
    	
    	//Annotation based configuration.
    	ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfiguration.class);
    	Employee emp = context.getBean(Employee.class);
    	System.out.println(emp);
    }
}
