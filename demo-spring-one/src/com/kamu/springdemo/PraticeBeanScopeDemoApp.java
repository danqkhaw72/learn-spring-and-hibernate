package com.kamu.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PraticeBeanScopeDemoApp {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("PraticeBeanScope-applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myGolfCoach", Coach.class);
		
		Coach alphalCoach = context.getBean("myGolfCoach", Coach.class);
		
		boolean result = (theCoach == alphalCoach);
		
		System.out.println("GolfCoach: Poiting to same object: "+ result);
		
		System.out.println("\nMemory location for the Coach: "+ theCoach);
		
		System.out.println("\nMemory location for alphalCoach: "+ alphalCoach);
		
		System.out.println(theCoach.getDailyWorkout());
		
		// close the context
		context.close();
	}

}
