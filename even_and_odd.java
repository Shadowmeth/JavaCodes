package practice;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// Write a program to take a number input from user and print if its even or odd
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		if (num % 2 == 0) {
			System.out.println(num + " is even");
		} else {
			System.out.println(num + " is odd");
		}
		
	}

}
