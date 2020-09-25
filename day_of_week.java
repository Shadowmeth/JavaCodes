package practice;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// Write a program that takes input from user and displays the day of the week
		// for example an input of 3 should output Wednesday
		Scanner input = new Scanner(System.in);
		int day = input.nextInt();
		
		if (day == 1) {
			System.out.println("Monday");
		} else if (day == 2) {
			System.out.println("Tuesday");
		} else if (day == 3) {
			System.out.println("Wednesday");
		} else if (day == 4) {
			System.out.println("Thursday");
		} else if (day == 5) {
			System.out.println("Friday");
		} else if (day == 6) {
			System.out.println("Saturday");
		} else if (day == 7) {
			System.out.println("Sunday");
		} else {
			System.out.println("Invalid day number entered!");
		}
		
	}

}
