package com.kamu.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService{

	@Override
	public String getFortune() {
		String[] arr = {"Today is your luck day! :3", "Today is your bad day", "Year is your luck year!"};
		Random result = new Random();
		int randomString = result.nextInt(arr.length);
		String theFortune = arr[randomString];
		return theFortune;
	}

}
