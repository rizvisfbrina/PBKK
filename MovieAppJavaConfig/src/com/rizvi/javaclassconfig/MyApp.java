package com.rizvi.javaclassconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// Create IoC 
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MovieConfig.class);
		
		UpcomingMovie upcoming = context.getBean("upcomingMovie", UpcomingMovie.class);
		
		System.out.println(upcoming.getDailyMovie());
		System.out.println(upcoming.getTitle());
		
		context.close();

	}

}
