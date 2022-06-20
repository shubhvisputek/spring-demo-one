package com.aurusinc.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
	
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		CricketCoach theCoach = context.getBean("myCricketCoachFromProperties",CricketCoach.class);
		
		//call methods on the beans
		System.out.println(theCoach.getDailyWorkout());
		
		// lets call our new method for fortunes
		System.out.println(theCoach.getDailyFortune());
		
		// lets call our new method for getting literal values
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
		
		//close the context
		context.close();

	}

}
