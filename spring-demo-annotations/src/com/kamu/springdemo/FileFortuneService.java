package com.kamu.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

	private String fileName = "C:\\Users\\MyPC\\eclipse-workspaceEE\\spring-demo-annotations\\src\\fortune-data.txt";
	private List<String> theFortunes;
	
	// create a random number generator
	private Random myRandom = new Random();
	
	public FileFortuneService() {
		File theFile = new File(fileName);
		
		System.out.println("Reading fortune from file: " + theFile);
		System.out.println("File exist: "+ theFile.exists());
		
		// initialize array list
		theFortunes = new ArrayList<String>();
		
		// read fortune from file
		try (BufferedReader br = new BufferedReader(new FileReader(theFile))) {
			
			String tempLine;
			
			while((tempLine = br.readLine()) != null) {
				theFortunes.add(tempLine);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public String getFortune() {
		// pick a random string from th array
		int index = myRandom.nextInt(theFortunes.size());
		
		String tempFortune = theFortunes.get(index);
		
		return tempFortune;
	}

}
