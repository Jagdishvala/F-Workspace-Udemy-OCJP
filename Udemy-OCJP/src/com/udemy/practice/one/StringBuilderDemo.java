package com.udemy.practice.one;

public class StringBuilderDemo {
	
	public static void main(String arg[]) {
		String str = "java";
        StringBuilder sb = new StringBuilder("java");

        System.out.println(str.equals(sb) + ":" + sb.equals(str));
	}

}
