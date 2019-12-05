package com.udemy.practice.one;

public class SwitchDemo {
	public static void main(String[] args) {
		//Integer var =7; 		Yes	
		//Character  var= '7'; 	No
		//char var ='7';		No
		//Character var 7;
		
		Character  var= 7; 	//Yes
		//char var =7;			Yes
		//String var="7";
		switch(var) {
		case 7:
			System.out.println("Lucky num 7");
			break;
		default:
            System.out.println("DEFAULT");
		
		}
	}

}
