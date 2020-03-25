package com.kamu.springdemo;

public class BaseballCoach implements Coach{
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getNameSport() {
		// TODO Auto-generated method stub
		return "Baseball";
	}

}
