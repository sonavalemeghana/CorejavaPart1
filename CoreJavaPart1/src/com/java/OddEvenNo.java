package com.java;

import java.util.Scanner;

public class OddEvenNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number:");
			int number=sc.nextInt();
			if(number %2==0) {
				System.out.println(number+ " is Even");
			}
			else
			{
				System.out.println(number+ " is Odd");
			}
			
			
	}

}
