package edu.handong.csee.java.lab13.prob3; //package name
import java.util.Scanner; //import java util scanner in order to scan the inserted value


public class Prob3 { //main class

	public static void main(String[] args) { 
		// TODO Auto-generated method stub

		double input1, input2; //declaration of double variables input1 and input2
		Scanner input = new Scanner(System.in);  //creates scanner for insertion

		System.out.print("Enter radius: "); //prints out the info
		input1 = input.nextDouble(); //insert the inserted value to input1
		Circle c1 = new Circle(input1); //initiate c1 of class Circle with the constructor that has a parameter input1

		System.out.println("Radius: " + c1.getRadius()); //prints out info and radius of c1
		c1.display(); //runs display method of c1


		System.out.print("Etner length and width: "); //prints out info
		input1 = input.nextDouble(); //insert the inserted value to input1
		input2 = input.nextDouble(); //insert the inserted value to input2
		Rectangle r1 = new Rectangle(input1,input2); //initiate r1 of class Rectangle with the constructor that has parameters input1 and input2

		System.out.println("Length: " + r1.getLength()); //prints out the length of r1
		System.out.println("Witdh: " + r1.getWidth()); //prints  out the width of r1
		r1.display(); //runs display method of r1
	}

}
