package com.syntax.class05;

import java.util.Scanner;

public class hw6 {

	public static void main(String[] args) {
		// Write a program for user to enter his/hers birth month. Based on the month
		// define
		// the season.
		// Example: if user is born in March, April, May season =“Spring”
		// if user is born in June, July, August  season =“Summer” etc …

		Scanner mon = new Scanner(System.in);
		System.out.println("Which month you were born?");

		String season = mon.next();
		if (season.equalsIgnoreCase("December") || season.equalsIgnoreCase("January")|| season.equalsIgnoreCase("February")) {
			System.out.println("You were born in winter");
		}else if (season.equalsIgnoreCase("March") || season.equalsIgnoreCase("April")|| season.equalsIgnoreCase("May")) {
			System.out.println("You were born in spring");
		}else if (season.equalsIgnoreCase("June") || season.equalsIgnoreCase("July")|| season.equalsIgnoreCase("August")) {
			System.out.println("You were born in summer");
		}else if (season.equalsIgnoreCase("September") || season.equalsIgnoreCase("october")|| season.equalsIgnoreCase("November")) {
			System.out.println("You were born in fall");
		}
	

	}

}
