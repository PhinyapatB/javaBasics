package com.syntax.class10;

public class TaskTwoDArray {

	public static void main(String[] args) {
		// Create a 2D array (longer way)where you will store the following
		// values: Mr, Mrs, Ms, Miss and Smith, Jordan, Jackson, Obama.
		// After storing values print following String:
		// Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.

		String[][] name = new String[2][4];

		name[0][0] = "Mr";
		name[0][1] = "Mrs";
		name[0][2] = "Ms";
		name[0][3] = "Miss";

		name[1][0] = "Smith";
		name[1][1] = "Jordan";
		name[1][2] = "Jackson";
		name[1][3] = "Obama";

		System.out.println(name[0][1] + " " + name[1][0] + ", " + name[0][0] + " " + name[1][3] + ", " + name[0][2]
				+ " " + name[1][2] + ", " + name[0][3] + " " + name[1][1]);
		System.out.println();

		// Create a 2D array(shorter way) in which first array will consist of 4 names
		// and second array will contain
		// grades. Then your program should print name of the students that has A and B
		// grade

		String[][] grades = { { "Smith", "Jordan", "Jackson", "Obama" }, { "A", "B", "C", "D" } };
		System.out.println(grades[0][0] + " has " + grades[1][0] + " grade");
		System.out.println(grades[0][1] + " has " + grades[1][0] + " grade");

	}

}
