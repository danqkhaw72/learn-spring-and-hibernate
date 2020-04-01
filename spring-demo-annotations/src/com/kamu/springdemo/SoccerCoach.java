package com.kamu.springdemo;

import org.springframework.stereotype.Component;

@Component
public class SoccerCoach implements Coach{
	
	// define a default constructor
		public void PingPongCoach() {
			System.out.println(">> SoccerCoach: inside default constructor");
		}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Jog 20 minutes a day";
	}

}
