package com.java;

import java.util.Scanner;

public class UserInput {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Your full name :");
		String name1=sc.nextLine();
		System.out.println("full name is :" +name1 );
		
		System.out.println("Enter your name :");
		 name=sc.next();
		System.out.println("My Name is :"+name);
		
		System.out.println("Enter the roll no:");
		int rollno=sc.nextInt();
		System.out.println("Roll no is "+rollno);

}
}
