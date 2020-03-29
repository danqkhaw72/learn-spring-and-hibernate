package com.kamu.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RandomDemoApp {

	public static void main(String[] args) {
		// load the spring configuration file 
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from container
		GolfCoach theCoachG = context.getBean("myGolfCoach", GolfCoach.class);
		// call method on the bean
		
		System.out.println(theCoachG.getDailyFortune());
		
		System.out.println(theCoachG.getDailyWorkout());
		
		// close context
		context.close();

	}

}
