package edu.handong.csee.java.lab13.prob6; //package name

public class Prob6 { //main class

	public static void main(String[] args) {
		
		UpPoint p1 = new UpPoint(3,3); //initiate p1 of class UpPoint
		DownPoint p2 = new DownPoint(2,5); //initiate p2 of class DownPoint
		DownPoint p3 = new DownPoint(4,7); //initiate p3 of class DownPoint
		UpPoint p4 = new UpPoint(9,12); //initiate p4 of class UpPoint
		
		Printer.print(p1); //run the method print of class Printer with the parameter of p1 
		Printer.print(p2); //run the method print of class Printer with the parameter of p2
		Printer.print(p3); //run the method print of class Printer with the parameter of p3 
		Printer.print(p4); //run the method print of class Printer with the parameter of p4 
	}

}
