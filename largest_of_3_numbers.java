package practice;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// take 3 numbers input from user and output the largest number
		Scanner input = new Scanner(System.in);
		int n1, n2, n3;
		n1 = input.nextInt();
		n2 = input.nextInt();
		n3 = input.nextInt();
	
		if (n1 > n2 && n1 > n3) {
			System.out.println(n1 + " is largest");
		} else if (n2 > n1 && n2 > n3) {
			System.out.println(n2 + " is largest");
		} else if (n3 > n1 && n3 > n2) {
			System.out.println(n3 + " is largest");
		}
		
	}

}

