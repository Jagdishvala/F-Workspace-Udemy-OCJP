package com.udemy.practice.one;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalDateDemo {
	
	public static void main(String[] args) {
		LocalDate ldate=LocalDate.of(2020,9,31);
		System.out.println(ldate);
		
		/*StringBuilder sb = new StringBuilder();
        System.out.println(sb.append(null).length());
        */
        
        /*LocalTime time = LocalTime.of(16, 40);
        String amPm = time.getHour() >= 12 ? (time.getHour() == 12) ? "PM" : "AM";
        System.out.println(amPm);*/
		
		/* double price = 90000;
         String model;
         if(price > 100000) {
             model = "Tesla Model X";
         } else if(price <= 100000) {
             model = "Tesla Model S";
         }
           System.out.println(model);*/
		
		 LocalDate date = LocalDate.parse("1947-08-14");
         LocalTime time = LocalTime.MAX;
         System.out.println(date.atTime(time));
	}

}
