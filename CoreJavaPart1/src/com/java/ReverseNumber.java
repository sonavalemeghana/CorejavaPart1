package com.java;

	
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int num = 123, reversed = 0;
			    
			    System.out.println("Original Num: " + num);

			    
			    while(num != 0)
			    {
			    
			      
			      int digit = num % 10;
			      reversed = reversed * 10+digit;

			     
			      num /= 10;
			    
			    }
			    System.out.println("Reversed Num: " + reversed);
			  }

	}

