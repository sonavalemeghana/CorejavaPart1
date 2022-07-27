package com.java;

import java.util.Scanner;

public class Palidrome {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int r,sum=0,temp;
       int num;
       
Scanner sc=new Scanner(System.in);
       
       System.out.println("Enter Number");
       num=sc.nextInt();
       
       temp=num;
       while(num>0)
       {
    	   r=num%10;
    	   sum=(sum*10)+r;
    	   num=num/10;
       }
       if(temp==sum)
    	   System.out.println("Palindrome number");
       else
    	   System.out.println("Not Palindrome Number");
	}

}

