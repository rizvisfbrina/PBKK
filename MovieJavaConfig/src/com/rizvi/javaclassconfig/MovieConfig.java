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
	public FortuneService happyFortuneService() {
		return new HappyFortuneService();
	}
	
	@Bean
	public Movie upcomingMovie(FortuneService fortuneService) {
		UpcomingMovie upcomingMovie2 = new UpcomingMovie(happyFortuneService());
		return upcomingMovie2;
	}

}
