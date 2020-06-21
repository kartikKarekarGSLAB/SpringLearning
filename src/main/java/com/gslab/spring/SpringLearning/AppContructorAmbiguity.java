package com.gslab.spring.SpringLearning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gslab.spring.beans.Addition;

public class AppContructorAmbiguity {

	public static void main(String[] args) {
    	//XML file based configuration.
    	ClassPathXmlApplicationContext content = new ClassPathXmlApplicationContext("config/xml/ContructorAmbiguity.xml");    	
    	Addition add = (Addition) content.getBean("addInt");
	}

}
