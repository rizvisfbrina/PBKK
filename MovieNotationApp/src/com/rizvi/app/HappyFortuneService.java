package com.rizvi.app;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
	
	@Override
	public String getFortune(){
		return "Today is Captain Marvel release date";
	}

}
