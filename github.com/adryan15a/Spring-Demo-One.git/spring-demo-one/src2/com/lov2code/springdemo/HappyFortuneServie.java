package com.lov2code.springdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HappyFortuneServie implements FortuneService {
	
	//ArrayList fortune = new ArrayList<String>();
	String[]fortune= {"today is your lucky day","lucky number 7","today is your birthday!"};
	Random r = new Random();
	
	public  String getFortune() {
		
		int randomIndex = r.nextInt(fortune.length);
		String f = fortune[randomIndex];
		
		return f;
	}
	
}
