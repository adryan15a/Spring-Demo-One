package com.lov2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemoApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		//retrive bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		Coach theCoolCoach = context.getBean("myCoolCoach",Coach.class);
		
		
		
		
		
		//close bean
		context.close();
		
	}

}
