package com.rizvi.javaclassconfig;

import org.springframework.beans.factory.annotation.Value;

public class UpcomingMovie implements Movie {

	private TheaterService theaterService;
	
	@Value("${foo.title}")
	private String title;
	
	@Value("${foo.date}")
	private String date;
	
	public UpcomingMovie() {
		
	}
	
	public UpcomingMovie(TheaterService theaterService) {
		this.theaterService = theaterService;
	}


	public TheaterService getTheaterService() {
		return theaterService;
	}



	public void setTheaterService(TheaterService theaterService) {
		this.theaterService = theaterService;
	}



	@Override
	public String getDailyMovie() {
		// TODO Auto-generated method stub
		return "Now Playing : 3 Movies";
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
