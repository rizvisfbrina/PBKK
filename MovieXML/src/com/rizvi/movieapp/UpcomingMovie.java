package com.rizvi.movieapp;

public class UpcomingMovie implements Movie {

	private TheaterService theaterService;
	String title;
	String date;
	
	@Override
	public void getDailyMovie() {
		System.out.println("Now Playing Movie");

	}

	public UpcomingMovie() {
		
	}

	public UpcomingMovie(TheaterService theaterService) {
		super();
		this.theaterService = theaterService;
	}

	public TheaterService getTheaterService() {
		return theaterService;
	}

	public void setTheaterService(TheaterService theaterService) {
		this.theaterService = theaterService;
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
