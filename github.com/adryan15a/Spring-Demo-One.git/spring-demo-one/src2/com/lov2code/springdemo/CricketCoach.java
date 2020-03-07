package com.lov2code.springdemo;

public class CricketCoach implements Coach {
	
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach : incide settor email  method");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach : incide settor team method");
		this.team = team;
	}

	private FortuneService fortuneService;
	
	//create a non arg constructor
//	public CricketCoach() {	
//		System.out.println("CricketCoach : incide non-arg constructor");
//	}
	
	//our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach : incide settor method");
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	

}
