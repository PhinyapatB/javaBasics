package com.syntax.class02;

public class ArithmeticOperators {

	public static void main(String[] args) {

		System.out.println("Task 1");
		double n1 = 12.05;
		double n2 = 4.21;

		double sum = n1 + n2;
		double sub = n1 - n2;
		double mul = n1 * n2;
		double div = n1 / n2;

		System.out.println("The add of 2 number " + n1 + " and " + n2 + " is equal to " + sum);
		System.out.println("The subtract of 2 number " + n1 + " and " + n2 + " is equal to " + sub);
		System.out.println("The muliply of 2 number " + n1 + " and " + n2 + " is equal to " + mul);
		System.out.println("The divide of 2 number " + n1 + " and " + n2 + " is equal to " + div);

		System.out.println("Task 2");
		double num = 3.9;
		double square = num * num;

		System.out.println("The square of the number " + num + " is " + square);

		System.out.println("Task 3");
		int width = 5;
		int height = 8;

		int perimeter = (width + height) * 2;
		int area = width * height;

		System.out.println("The perimeter of a rectangle with width " + width + " and height " + height
				+ " is equal to " + perimeter + " and the area is " + area);
		
		
	}

}
