package com.rizvi.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		//Create IoT Container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("notationconfig.xml");
		
		// Get Bean
		Movie movie = context.getBean("nowPlayingMovie", Movie.class);
		NowPlayingMovie happy = context.getBean("nowPlayingMovie", NowPlayingMovie.class);
		
		System.out.println(movie.getDailyMovie());
		System.out.println(happy.getTheaterService().getTheater());
		
		
		context.close();

	}

}
