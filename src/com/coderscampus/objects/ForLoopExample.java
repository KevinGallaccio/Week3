package com.coderscampus.objects;

public class ForLoopExample {
	
	void forLoopExample () {
		
	// for (init; termination condition; increment)
	// Example:
	// for (int i = 1; i <= 10; i = i + 1) {
	//	System.out.println(i);
	
	// Same as :
	
		//System.out.println("1");
		//System.out.println("2");
		//System.out.println("3");
		//System.out.println("4");
		//System.out.println("5");
		//System.out.println("6");
		//System.out.println("7");
		//System.out.println("8");
		//System.out.println("9");
		//System.out.println("10");
	
	// }
	
	for (int i = 1;i <=100; i = i + 1) {
		System.out.print(i + ": ");
		System.out.println(i*i);	
	}
	System.out.println("Done");
	}
}
