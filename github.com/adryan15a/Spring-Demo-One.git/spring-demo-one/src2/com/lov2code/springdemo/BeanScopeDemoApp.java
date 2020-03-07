package com.lov2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		//this is singletone!
		//load Spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		Coach alfaCoach = context.getBean("myCoach",Coach.class);
		
		//check if they are the same
		boolean result=(theCoach==alfaCoach);
		
		System.out.println("Memory location the theCoach "+ theCoach);
		System.out.println("Memory location the alfaCoach "+ alfaCoach);
		
		System.out.println(result);
		
		
		//close the context
		
		context.close();

	}

}
