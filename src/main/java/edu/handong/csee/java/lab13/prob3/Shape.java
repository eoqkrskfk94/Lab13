package edu.handong.csee.java.lab13.prob3; //package name

public abstract class Shape { //declaration of abstract class Shape
	
	public abstract double area(); //declaration of abstract method area
	public abstract double perimeter(); //declaration of abstract method perimeter
	
	public void display() { //declaration of method dispaly
		System.out.println("Area: " + area() + "\nPerimeter: " + perimeter() + "\n"); //prints out the info (area and perimeter value)
	}

}
