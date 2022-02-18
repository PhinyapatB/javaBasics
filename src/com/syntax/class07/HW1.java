package com.syntax.class07;

public class HW1 {

	public static void main(String[] args) {

		// Print numbers from 1 to 100 in 1 line with space
		int a = 0;
		for (a = 1; a <= 100; a++) {
			System.out.print(a + " ");
		}
		System.out.println("The end");

		// Print numbers from 100 to 1
		int b = 0;
		for (b = 100; b >= 1; b--) {
			System.out.print(b + " ");
		}
		System.out.println("The end");

		// Print even numbers from 20 to 1 (2 ways)
		int c = 0;
		for (c = 2; c <= 20; c += 2) {

			System.out.print(c + " ");
		}
		System.out.println("The end");

		int d = 0;
		for (d = 20; d >= 1; d -= 2) {

			System.out.print(d + " ");
		}
		System.out.println("The end");

		// Print odd numbers between 20 and 50 (2 ways)
		int e = 0;
		for (e = 21; e <= 50; e+=2) {

			System.out.print(e + " ");
		}
		System.out.println("The end");

		int f = 0;
		for (f = 49; f >= 20; f-=2) {
	
			System.out.print(f + " ");
		}
		System.out.println("The end");

	}

}
