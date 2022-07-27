package com.java;

public class StringFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			String s=" hi ";
			System.out.println("trim"+s.trim());
			System.out.println("Length "+s.length());
			
			//for each loop
			String str="Hello How are you";
			String[]arrOfStr=str.split(" ", 4);
			for(String a: arrOfStr) {
				System.out.println(a);
			}
			
			
			
	}

}
