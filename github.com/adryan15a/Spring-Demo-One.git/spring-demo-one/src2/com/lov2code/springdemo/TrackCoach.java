package com.lov2code.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}
	
	//add an init method
	public void doMySturtupStuff() {
		System.out.println("TrackCoach: incide method doMySturtupStuff");
	}
	
	//add an destroy method
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: incide method doMyCleanupStuff");
	}

}
