package com.ashish.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/ashish/autowired/student.xml");
		Student s = (Student) context.getBean("student");
		System.out.println(s);
	}

}
