package com.syntax.class05;

import java.util.Scanner;

public class hw5 {

	public static void main(String[] args) {

		// Write a program that will read three inputs of scores (quiz, mid term, and
		// final scores)
		// and determine the grade based on the following rules:
		// if the average score >=90 grade=A
		// if the average score >= 70 and <90 grade=B
		// if the average score>=50 and <70 grade=C
		// if the average score<50 grade=F

		Scanner score = new Scanner(System.in);
		System.out.println("What is your quiz score?");
		int qui = score.nextInt();

		System.out.println("What is your midtrem score?");
		int mid = score.nextInt();

		System.out.println("What is your final score?");

		int fin = score.nextInt();

		double ave = ((qui + mid + fin) / 3);

		if (ave > 90) {
			System.out.println("You got A");
		}
		else if (ave >= 70 && ave < 90) {
			System.out.println("You got B");
		}
		else if (ave >= 50 && ave < 70) {
			System.out.println("You got C");
		}
		else if (ave < 50) {
			System.out.println("You got F");
		} else {
			System.out.println("");
		}

	}

}
