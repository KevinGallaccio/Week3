package com.coderscampus.Exercise2;

import java.util.Scanner;

public class ScannerObject {
	
	String getResult() {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
        Integer convertedinput = Integer.parseInt(input);
    	scanner.close();	
        if(convertedinput >= 50 && convertedinput <= 300){
			return input;
		} else {
			return "null";
		}
	}
}
