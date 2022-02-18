package com.syntax.class08;

public class task {

	public static void main(String[] args) {

		int sumOdd = 0;

		for (int a = 1; a <= 50; a += 2) {
			sumOdd += a;
		}

		int sumEven = 0;

		for (int b = 2; b <= 50; b += 2) {
			sumEven += b;
		}

		System.out.println("Sum of all odd number is " + sumOdd + " and sum of all even number is " + sumEven);

	}

}
