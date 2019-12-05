package com.udemy.localdate.example;

import java.time.LocalDate;
import java.time.Month;

public class CurrentDate {
	
	public static void main(String arg[]) {
		LocalDate localDate=LocalDate.now();
		System.out.println(localDate);
		//pring the date in this formate //2019-12-04 yyyy-mm-dd
		
		LocalDate localDate2 = LocalDate.of(2017, Month.MAY, 15);
	    System.out.println(localDate2);
	    
	    
	    
		
	}

}
