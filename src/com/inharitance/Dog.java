package com.inharitance;

public class Dog extends Animal{ // Унаследовали все из класса Animal
	
	public Dog() {
		super(4);
		System.out.println("I'm child constructor (Dog)");
	}
	
	public Dog(int a) {
		super (a);
		System.out.println("This is " + a);
	}
	
	public void bringTheBall() {
		System.out.println("I'm getting the ball on " + countOfLegs + " legs");
			}


	
}
