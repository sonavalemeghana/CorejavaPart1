package com.java;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i ,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int number=sc.nextInt();
		for(i=1;i<=number;i++) {
			 if(number%i==0) {
				 
				count++;
			 }
			
	}
		if(count==2) {
			
			System.out.println("Prime no :");
		}
		
		else {
			System.out.println("not prime no :");
		}
}
}
