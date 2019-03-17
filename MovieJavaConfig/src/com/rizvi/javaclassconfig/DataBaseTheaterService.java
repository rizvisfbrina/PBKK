package com.rizvi.javaclassconfig;

import org.springframework.stereotype.Component;

@Component
public class DataBaseTheaterService implements TheaterService {
	
	@Override
	public String getTheater() {
		return "Theater 3";
	}

}
