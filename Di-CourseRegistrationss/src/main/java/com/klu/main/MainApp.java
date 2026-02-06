package com.klu.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.klu.model.CourseRegistrationss;

public class MainApp {

	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		CourseRegistrationss cr=(CourseRegistrationss)context.getBean("courseRegistration");
		cr.display();
	}

}