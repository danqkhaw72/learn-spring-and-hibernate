package com.kamu.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		// read the spring configuration file
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(MyLoggerConfig.class,SportConfig.class);
		
		// get the bean from spring container
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// call a method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		// call our new swim coach methods ... has the props values injected
		System.out.println("Email: " + theCoach.getEmail());
		System.out.println("Team: " + theCoach.getTeam());
		
		// close the context
		context.close();
	}

}
