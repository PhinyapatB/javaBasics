package com.syntax.class05;

import java.util.Scanner;

public class hw3 {

	public static void main(String[] args) {

		// Ask user to enter a number and then define if number is small, medium or
		// large
		// Small number is value between 1 and 10
		// Medium number is value between 11 and 100
		// Large number is value between 101 and 1000

		Scanner input = new Scanner(System.in);
		System.out.println("please pick number between 1 and 1000");

		int num = input.nextInt();
		if (num > 0 && num < 11) {
			System.out.println("The number is small");
		} else if (num > 10 && num < 101) {
			System.out.println("The number is medium");
		}else {
			System.out.println("The number is large");
		}

	}

}
