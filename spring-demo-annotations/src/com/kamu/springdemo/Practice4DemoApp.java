package com.kamu.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Practice4DemoApp {

	public static void main(String[] args) {
		
		// load spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("soccerCoach", Coach.class);
		
		// call methods from bean
		System.out.println(theCoach.getDailyWorkout());
		
		// close context
		context.close();
		
	}

}
