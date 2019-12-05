package com.udemy.localdate.example;

import java.time.LocalDate;

public class FindYearMonthDayFromLocalDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate localDate =LocalDate.now();
		
		System.out.println(localDate.getYear()); //print the current year
		System.out.println(localDate.getDayOfYear()); //print the Current day out of 365
		System.out.println(localDate.getMonth().getValue());//print the current month number eg. if current Month is December then print 12 
		System.out.println(localDate.getMonthValue());//you can directly print the current month value using this method.
		//Add 5 Days into current date and it will print the date like this 2019-12-10
		System.out.println("add 5 Days into current date "+localDate.plusDays(5));
		/*Add 1 month into current date and it will print the full date 
		eg.suppose your current month is Dec 2019 and you add one month into it 
		then result is "2020-01-05" */
		System.out.println("add 1 month into current date "+localDate.plusMonths(1));

	}

}
