package com.syntax.class05;

import java.util.Scanner;

public class hw4 {

	public static void main(String[] args) {
		// 2. Write a program that will ask user to input inputs the current time (use24 hour format).
		// Based on the given time define:

		// if hour is between 1-11  Morning
		// if hour between 12-15    Afternoon
		// if hour between 16-20    Evening
		// if hour between 21-24     Night

		Scanner input = new Scanner(System.in);
		System.out.println("What time is it in 24 hour format?");
		
		int time=input.nextInt();
		if (time>1 && time<12) {
			System.out.println("It is morning");
		}if (time>11 && time<16) {
			System.out.println("It is afternoon");
		}if (time>15 && time<21) {
			System.out.println("It is evening");
		}if (time>20 && time<25) {
			System.out.println("It is night");
		}
		
		
		
		
	}

}
