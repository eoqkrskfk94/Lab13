package edu.handong.csee.java.lab13.prob4; //package name

public class Animal { //declaration of class Animal
	private String name; //declaration of String variable name
	
	public void setName(String name) { //declaration of setter method setName with the parameter of String name
		this.name = name; //insert parameter value of name into name variable of the class
	}
	
	public void getName() { //declaration of getter method getName
		System.out.println("Name: " + name); //prints ou the info
	}
}
