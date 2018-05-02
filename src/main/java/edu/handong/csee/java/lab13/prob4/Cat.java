package edu.handong.csee.java.lab13.prob4; //package name

public class Cat extends Animal implements Pet{ //declaration of class Cat inherits Animal and implements class Pet
	
	public String food() { //implementation of food method 
		return "(Cat!)" + "Fish"; //returns the string value
	}
}
