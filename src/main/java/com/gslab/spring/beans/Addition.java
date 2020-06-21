package com.gslab.spring.beans;

public class Addition {

	public Addition() {
		System.out.println("inside default constructor");
	}
	
	public Addition(int number1, int number2) {
		System.out.println("inside INTEGER constructor");
		System.out.println(number1);
		System.out.println(number2);
		System.out.println("Addition :"+(number1+number2));
	}
	
	public Addition(String number1, String number2) {
		System.out.println("inside Strings constructor");
		System.out.println(number1);
		System.out.println(number2);
		System.out.println("Addition :"+(number1+number2));
	}
	
	public Addition(double number1, double number2) {
		System.out.println("inside DOUBLES constructor");
		System.out.println(number1);
		System.out.println(number2);
		System.out.println("Addition :"+(number1+number2));
	}
	
	public Addition(double number1, int number2) {
		System.out.println("inside DOUBLES & INTEGER constructor");
		System.out.println(number1);
		System.out.println(number2);
		System.out.println("Addition :"+(number1+number2));
	}
	
}
