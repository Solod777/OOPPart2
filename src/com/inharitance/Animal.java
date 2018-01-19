package com.inharitance;

public class Animal {
	
	String name;
	int countOfLegs;
	String voice;
	
//	public Animal() {
//		System.out.println("I'm animal constructor");
//	}
	
	public Animal (int b) {
		System.out.println("This is " + b);
	}
	
	public void introduceYourself() {
		System.out.println("I'm " + name);
	}
	
	public String getVoice() {
		return voice;
	}
}
