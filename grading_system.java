package practice;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int marks = input.nextInt();
		
		if (marks >= 90 && marks <= 100) {
			System.out.println("A*");
		} else if (marks >= 80 && marks <= 89) {
			System.out.println("A");
		} else if (marks >= 70 && marks <= 79) {
			System.out.println("B");
		} else if (marks < 0 || marks > 100) {
			System.out.println("Invalid marks entered!");
		} else {
			System.out.println("Fail");
		}
		
	}

}
