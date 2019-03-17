package com.rizvi.javaclassconfig;

import org.springframework.beans.factory.annotation.Value;

public class UpcomingMovie implements Movie {

	private FortuneService fortuneService;
	
	@Value("${foo.title}")
	private String title;
	
	@Value("${foo.date}")
	private String date;
	
	public UpcomingMovie() {
		
	}
	
	public UpcomingMovie(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}


	public FortuneService getFortuneService() {
		return fortuneService;
	}



	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}



	@Override
	public String getDailyMovie() {
		// TODO Auto-generated method stub
		return "Now Playing : 5 Movies";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
}
