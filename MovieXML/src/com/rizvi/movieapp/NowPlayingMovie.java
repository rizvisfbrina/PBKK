 package com.rizvi.movieapp;

public class NowPlayingMovie implements Movie {

	private FortuneService fortuneService;
	
	public NowPlayingMovie() {
		
	}

	public NowPlayingMovie(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public void getDailyMovie() {
		System.out.println("Now Playing Movie : Captain Marvel(2019)");
	}

}
