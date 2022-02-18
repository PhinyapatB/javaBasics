package com.syntax.class07;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		/*
		 * Declare a variable to store a price for a coffee. Ask user to pay for a
		 * coffee. Keep asking to pay for coffee until user enters exact amount . If
		 * user give more than $3 --> ask them to give less, if user gives less money
		 * then ask to give more. Once user got a write amount print “Please enjoy your
		 * candy”
		 */

		Scanner input = new Scanner(System.in);

		double price = 2.50;
		System.out.println("Please pay for your coffee");

		double money;

		do {
			money = input.nextDouble();
			if (money > price) {
				System.out.println("Please pay less");

			} else if (money < price) {
				System.out.println("Please pay more");
			}

		} while (money != price);

		System.out.println("Please enjoy your coffee");

	}
}
