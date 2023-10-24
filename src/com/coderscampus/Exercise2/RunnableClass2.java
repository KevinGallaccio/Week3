package com.coderscampus.Exercise2;

public class RunnableClass2 {

	public static void main(String[] args) {
		System.out.println("Type a number between 50 and 300");
		ScannerObject userInput = new ScannerObject();   
		System.out.println("The number you typed in was: " + userInput.getResult());
	}
}
