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
	@Qualifier("dataBaseFortuneService")
	private FortuneService fortuneService;
	
	public NowPlayingMovie() {
		
		
	}
	
	//dependency injection using constructor
	//@Autowired
	public NowPlayingMovie(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public FortuneService getFortuneService() {
		return fortuneService;
	}
	
	//dependency injection using setter / mutator
	//@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyMovie() {
		// TODO Auto-generated method stub
		return "Now Playing movie : Captain Marvel";
	}

}