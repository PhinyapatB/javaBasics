package com.syntax.class06;

import java.util.Scanner;

public class HWClass6_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter 2 numbers");

		int num1 = input.nextInt();
		int num2 = input.nextInt();

		System.out.println("Please enter operator (+,-,*,/)");
		char operator = input.next().charAt(0);
		double result = 0;

		switch (operator) {

		case '+':
			result = (num1 + num2);
			break;
		case '-':
			result = (num1 - num2);
			break;
		case '*':
			result = (num1 * num2);
			break;
		case '/':
			result = (num1 / num2);
			break;
		default:
			System.out.println("unknow");
			break;

		}
		System.out.println("The result is " + result);

	}

}
