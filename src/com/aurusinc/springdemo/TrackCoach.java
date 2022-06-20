package com.aurusinc.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach() {
	}
	
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "run 30 minutes on track";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It " + fortuneService.getFortune();
	}
}
