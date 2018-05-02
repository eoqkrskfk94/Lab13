package edu.handong.csee.java.lab13.prob3; //package name

public class Circle extends Shape{ //class Circle inherits class Shape
	
	private double radius; //declaration of private double variable radius
	
	public Circle(double num) { //delcaration of constructor Circle with the paramter of double num
		this.radius = num; //inserted num value(parameter value) to radius
	}
	
	public double area() { //declaration of area method
		
		return Math.PI * Math.pow(this.radius,2); //returns the calculated value (area value)
	}
	
	public double perimeter() { //declaration of perimeter method
		
		return 2.0 * Math.PI * this.radius; //returns the calculated value (perimeter value)
	}
	
	public double getRadius() { //declaration of getter method getRadius
		
		return this.radius; //returns radius value
	}


}
