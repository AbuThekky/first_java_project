package com.qa.exercise;

public class Exam {

	public static double Result(double Physics, double Chemistry, double Biology) {
		System.out.println("Physics: "+ Physics + " | Chemistry: "+ Chemistry + " | Biology: "+ Biology);
		System.out.print("Total Mark: " + (Physics + Chemistry + Biology) + " | Final Percentage: ");
		return (Physics + Chemistry + Biology) / 450 * 100;
	}
}
