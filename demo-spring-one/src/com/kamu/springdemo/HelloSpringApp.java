package com.kamu.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// load the spring configuration file
		
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach theCoachTwo =  context.getBean("myCoachTwo", Coach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println("-------------");
		System.out.println(theCoachTwo.getNameSport());
		System.out.println(theCoachTwo.getDailyWorkout());
		
		// let's call out new method for fortune
		System.out.println(theCoach.getDailyFortune());
		
		// close the context
		context.close();

	}

}
