package com.syntax.class07;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
		// 2. Ask a user to enter name, last name and age 5 times.
		// Every time your program should print those values in a format
		// You name is and you are years old

		Scanner input = new Scanner(System.in);

		for (int i = 1; i <= 5; i++) {
			System.out.println("Please enter name");
			String name = input.next();

			System.out.println("Please enter last name");
			String lastName = input.next();

			System.out.println("Please enter age");
			int age = input.nextInt();

			System.out.println("You name is " + name + " " + lastName + " and you are " + age + " years old");
			System.out.println("---------------------------------------------------");
		}

	}

}
