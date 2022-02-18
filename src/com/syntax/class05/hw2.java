package com.syntax.class05;

import java.util.Scanner;

public class hw2 {

	public static void main(String[] args) {

		/* Write a program that will print whether it is a weekend or weekday.
		* If any day from 1-5  output “It is a weekday”, anyday from 6-7  output “It
		* is a weekend”,
		*any other day  output “Invalid day”
		*/

		Scanner input = new Scanner(System.in);
		System.out.println("what is the date?");
		
		int date=input.nextInt();
		if (date>=1 && date<=5) {
			System.out.println("It ia a weekday");
		}else if (date>5 && date<8) {
			System.out.println("It is a weekend");
		}else {
			System.out.println("Invalaid day");
		}
		
	}

}
