package com.coderscampus.Exercise3;

import java.util.Scanner;

public class ScannerService {
	
	void getResult() {
		Scanner scanner = new Scanner(System.in);
		int input;
		
		System.out.println("Type a number between 50 and 300: ");
		input = scanner.nextInt();
		while (input < 50 || input > 300) {
		System.out.println("Oops, that number wasn't between 50 and 300, try again: ");
		input = scanner.nextInt();
		
	}
		System.out.println("The number you typed in was: " + input);
    	scanner.close();	
	}
}
