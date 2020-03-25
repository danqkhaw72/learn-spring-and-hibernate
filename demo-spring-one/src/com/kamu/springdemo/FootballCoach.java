package com.kamu.springdemo;

public class FootballCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run 60 minutes a day";
	}

	@Override
	public String getNameSport() {
		// TODO Auto-generated method stub
		return "Football";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
