package com.rizvi.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("nowPlaying")

//Default bean ID : nowPlaying
@Component
public class NowPlayingMovie implements Movie {
	
	//dependency injection using field directly
	@Autowired
	@Qualifier("dataBaseTheaterService")
	private TheaterService theaterService;
	
	public NowPlayingMovie() {
		
		
	}
	
	//dependency injection using constructor
	//@Autowired
	public NowPlayingMovie(TheaterService theaterService) {
		this.theaterService = theaterService;
	}
	
	public TheaterService getTheaterService() {
		return theaterService;
	}
	
	//dependency injection using setter / mutator
	//@Autowired
	public void setTheaterService(TheaterService theaterService) {
		this.theaterService = theaterService;
	}

	@Override
	public String getDailyMovie() {
		// TODO Auto-generated method stub
		return "Now Playing movie : Captain Marvel";
	}

}