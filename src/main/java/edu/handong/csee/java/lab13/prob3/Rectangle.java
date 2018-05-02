package edu.handong.csee.java.lab13.prob3; //package name

public class Rectangle extends Shape{ //class Rectangle inherits class Shape

	private double length, width; //declaration of double variables length and width
	
	public Rectangle(double num1, double num2) { //declaration of constructor with the parameters of num1 and num2 
		
		this.length = num1; //insert the value of num1 to length
		this.width = num2; //insert the value of num2 to width
	}
	
	public double area() { //declaration of method area
		
		return this.length * this.width; //returns the calculated value (area)
	}
	
	public double perimeter() { //declaration of method perimeter
		
		return 2*(this.length + this.width); //returns the calculated value (perimeter)
	}
	
	public double getLength() //declaration of getter method getLength
	{
		return this.length; //returns the value of length
	}
	
	public double getWidth() { //declaration of getter method getWidth
		
		return this.width; //returns the value of width
	}
}
