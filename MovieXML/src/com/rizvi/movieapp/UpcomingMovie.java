package com.rizvi.movieapp;

public class UpcomingMovie implements Movie {

	private FortuneService fortuneService;
	String title;
	String date;
	
	@Override
	public void getDailyMovie() {
		System.out.println("Now Playing Movie");

	}

	public UpcomingMovie() {
		
	}

	public UpcomingMovie(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
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
