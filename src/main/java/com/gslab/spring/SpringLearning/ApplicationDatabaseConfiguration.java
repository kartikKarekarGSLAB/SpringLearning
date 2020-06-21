package com.gslab.spring.SpringLearning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gslab.spring.dao.DatabaseServer;

public class ApplicationDatabaseConfiguration {

	public static void main(String[] args) {
    	//XML file based configuration.
    	ClassPathXmlApplicationContext content = new ClassPathXmlApplicationContext("config/xml/PropertiesConfiguration.xml");    	
    	DatabaseServer dbServer = (DatabaseServer) content.getBean("DBconnection");
    	System.out.println(dbServer);
	}

}
