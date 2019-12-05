package com.udemy.localdate.example;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateFormateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter oldPattern  = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		DateTimeFormatter newPattern  = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		LocalDateTime dateTime=LocalDateTime.now();
		System.out.println(dateTime.format(newPattern));
		String newD=dateTime.format(oldPattern);
		System.out.println(newD);
		
		
		
	}

}
