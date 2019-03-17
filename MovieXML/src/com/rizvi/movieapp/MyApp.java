package com.rizvi.movieapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	public static void main(String[] args) {
		//Create IoC Container
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("appconfig.xml");
		
		//retrieve the bean object
		Movie movie = context.getBean("myMovie", Movie.class);
		movie.getDailyMovie();
		
		UpcomingMovie upcomingMovie = (UpcomingMovie) movie;
		System.out.println(upcomingMovie.getFortuneService().getFortune());
		System.out.println(upcomingMovie.getTitle() + ", " + upcomingMovie.getDate());
		
		//Bean scope : Singleton
		UpcomingMovie movie1 = context.getBean("myMovie", UpcomingMovie.class);
		UpcomingMovie movie2 = context.getBean("myMovie", UpcomingMovie.class);
		System.out.println("movie 1: " + movie1);
		System.out.println("movie 2: " + movie2);
		
		movie2.setTitle("Diganti");

		System.out.println("movie 1: " + movie1.getTitle());
		System.out.println("movie 2: " + movie2.getTitle());
		
		//Bean scope : Prototype
		UpcomingMovie movie3 = context.getBean("myMoviePrototype", UpcomingMovie.class);
		UpcomingMovie movie4 = context.getBean("myMoviePrototype", UpcomingMovie.class);
		System.out.println("movie 3: " + movie3);
		System.out.println("movie 4: " + movie4);
		
		movie3.setTitle("Bukan Test");
		System.out.println("movie 3: " + movie3.getTitle());
		System.out.println("movie 4: " + movie4.getTitle());
		
				
		// Close IoC container
		context.close();
	}
}
