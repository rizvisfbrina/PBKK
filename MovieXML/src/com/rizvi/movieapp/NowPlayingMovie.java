 package com.rizvi.movieapp;

public class NowPlayingMovie implements Movie {

	private TheaterService theaterService;
	
	public NowPlayingMovie() {
		
	}

	public NowPlayingMovie(TheaterService theaterService) {
		this.theaterService = theaterService;
	}

	public TheaterService getTheaterService() {
		return theaterService;
	}

	public void setTheaterService(TheaterService theaterService) {
		this.theaterService = theaterService;
	}

	@Override
	public void getDailyMovie() {
		System.out.println("Now Playing Movie : Captain Marvel(2019)");
	}

}
