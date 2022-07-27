package com.java;

import java.util.Scanner;

public class String {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		
		//variable declaration and initialization
		 Scanner sc=new Scanner(System.in); 
		    //create a scanner object for input
		    
		System.out.println("Enter the String  ");
	 str=sc.nextLine();
		for(int i=0; i<str.length()-1; i++){
		char ch=str.charAt(i);
		if(str.charAt(i)==' ' && str.charAt(i+1)!=' '){//count words
		    words++;
		}
		else if(str.charAt(i)!=' '){//count characters
		    characters++;
		}
		}
		System.out.println("\nTotal words: "+words);//display words
		System.out.println("Total characters: "+characters);//display characters
		System.out.println("Space: "+(words-1));
				
				
			
	}

	

}
