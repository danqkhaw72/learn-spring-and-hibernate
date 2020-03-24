package com.kamu.springdemo;

public class MyApp {

	public static void main(String[] args) {
		// create the object
		Coach baseballCoach = new TrackCoach();
		
		//use the object
		System.out.println(baseballCoach.getDailyWorkout());

	}

}
