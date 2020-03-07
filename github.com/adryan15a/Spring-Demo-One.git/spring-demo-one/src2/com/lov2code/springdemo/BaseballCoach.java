package com.lov2code.springdemo;

public class BaseballCoach implements Coach {
	//define a private field for the constructor
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	public String getDailyFortune() {
		// use my fortune service to get a fortune
		return fortuneService.getFortune();
	}
	
	public void doMathStuff() {
		System.out.println(2+"0"+2+"0");
	}
	
	public void doEndMesageStuff() {
		System.out.println("THE END");
	}
	
	

}
