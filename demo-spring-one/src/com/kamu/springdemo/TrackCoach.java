package com.kamu.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService FortuneService;
	
	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		super();
		FortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5km";
	}

	@Override
	public String getNameSport() {
		// TODO Auto-generated method stub
		return "Trackball";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it: " + FortuneService.getFortune();
	}

}
