package com.java;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i ,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int number=sc.nextInt();
		for(i=1;i<=number;i++) {
			fact=fact*i;
		}
System.out.println("Factorial of "+number+ "is :"+fact);
	}

}
