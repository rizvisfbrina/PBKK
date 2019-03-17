package com.rizvi.app;

import org.springframework.stereotype.Component;

@Component
public class NumberTheaterService implements TheaterService {
	
	@Override
	public String getTheater(){
		return "Captain Marvel is on Theater 3";
	}

}
