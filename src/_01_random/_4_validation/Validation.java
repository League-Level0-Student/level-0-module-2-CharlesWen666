//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		for(int i = 0; i<5; i++) {	
		Random randomMaker = new Random();
		
		int no = randomMaker.nextInt(5)+1;
		System.out.println(no);
		

		// 1. Use each value of randomNumber to give the user a random compliment.
		
		if(no==5) {
			System.out.println("!");
		}
		if(no==4) {
			System.out.println("srazy");
		}
		if(no==3) {
	System.out.println("so");
}
if(no==2) {
	System.out.println("are");
}
if(no==1) {
	System.out.println("You");
	System.out.println(no);
	
}
		}
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
