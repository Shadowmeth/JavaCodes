package practice;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// Take a character input from user and output weather its a vowel or not
		Scanner input = new Scanner(System.in);
		String userInput = input.nextLine();
		
		if (userInput.equals("a") || userInput.equals("e") || userInput.equals("i") || userInput.equals("o")
			|| userInput.equals("u")) {
			System.out.println(userInput + " is a vowel!");
		} else {
			System.out.println(userInput + " is not a vowel. sed lyf :(");
		}
	}

}
