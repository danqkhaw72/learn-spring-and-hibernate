package com.kamu.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("fileFortuneService")
	FortuneService fortuneService;
	
	// define a default constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}
	
	// define my init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("TennisCoach: inside of doMyStartupCoach()");
	}
	
	// difine my destroy method
	@PreDestroy
	public void doMyClearupStuff() {
		System.out.println("TennisCoach: inside of doMyClearupStuff()");
	}
	
	/*
	// define a setter method
	@Autowired
	public void setTennisCoach(FortuneService theFortuneService) {
		System.out.println(">> TennisCoach: inside setFortuneService");
		this.fortuneService = theFortuneService;
	}
	*/
	
	/*
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}
	*/
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
