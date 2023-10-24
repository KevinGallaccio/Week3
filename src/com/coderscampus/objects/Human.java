package com.coderscampus.objects;

public class Human {
	String gender;
	String height;
	String weight;
	String eyeColor;
	
	// (visibility modifier), return type, method name, params (), scope {}
	
	String getInfo () {
		return "Gender: " + gender + ", Height: " + height + 
				", Eye Color: " + eyeColor + ", Weight: " + weight;
		
	}
	
	void setProperties (String gender, String height, 
			String weight, String eyeColor) {
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		this.eyeColor = eyeColor;
		
		
		// this. refers to the individual instantiated object (at the top) 
		// for example, this. refers to .trevorPage on the first line
		
	}
	
}
