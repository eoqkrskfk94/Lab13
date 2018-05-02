package edu.handong.csee.java.lab13.prob6; //package name

public class Printer { //declaration of class Printer
	public static void print(Object object) { //declaration of static method print with the parameter of Object object 
		
		String str = object.toString(); //declaration of String str and insert the value of the returned value of the method toString of object
		if(object instanceof CapitalPrint) str = str.toUpperCase(); //if the object is an instance of CapitalPrint then change the string str to uppercases
		
		System.out.println(str); //prints the the string value of str
	}
}
