package com.kamu.springdemo;

public class GolfCoach implements Coach{
	

	private FortuneService fortuneService;
	
	public GolfCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Playing Golf for 2 hour a day";
	}

	@Override
	public String getNameSport() {
		// TODO Auto-generated method stub
		return "Golf";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
