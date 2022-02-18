package com.syntax.class09;

public class HW {

	public static void main(String[] args) {
		// Create an array on integers and calculate the sum of all elements in an array

		int[] nums = { 52, 40, 50, 99, 44};

		int largestNum = nums[0];

		for (int j : nums) {
			if (j > largestNum)
				largestNum = j;
		}

		System.out.println("The largest number is " + largestNum);

	}

}
