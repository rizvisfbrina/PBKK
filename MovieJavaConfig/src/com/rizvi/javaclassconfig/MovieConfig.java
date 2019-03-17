package com.rizvi.javaclassconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//Configuration job : IoC + Dependency Injection

@Configuration
@PropertySource("classpath:movie.properties")
public class MovieConfig {
	
	//IoC
	//Create object
	@Bean
	public Movie upcomingMovie() {
		UpcomingMovie upcomingMovie = new UpcomingMovie();
		return upcomingMovie;
	}
	
	@Bean
	public TheaterService numberTheaterService() {
		return new NumberTheaterService();
	}
	
	@Bean
	public Movie upcomingMovie(TheaterService theaterService) {
		UpcomingMovie upcomingMovie2 = new UpcomingMovie(numberTheaterService());
		return upcomingMovie2;
	}

}
