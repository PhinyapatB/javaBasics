package com.syntax.class06;

import java.util.Scanner;

public class HWClass6_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Is there for sale? (yes or no)");

		String sale = input.next();

		if (sale.equalsIgnoreCase("no")) {
			System.out.println("You are not going for shopping");
		} else {
			System.out.println("Please enter the price of the item");
		}

		double price = input.nextInt();
		double dis;
		double total;

		if (0<=price && price < 20) {
			dis = 10;
			total = (price-(price * 0.1));
		} else if (price >= 20 && price <= 100) {
			dis = 20;
			total = (price-(price * 0.2));
		} else if (price >= 100 && price <= 500) {
			dis = 30;
			total = (price-(price * 0.3));
		} else {
			dis = 50;
			total = (price-(price * 0.5));
		}
		System.out.println("After discount " + dis + "% the price of the item reduce from " + price + " to " + total);

	}

}
