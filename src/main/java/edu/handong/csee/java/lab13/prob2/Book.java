package edu.handong.csee.java.lab13.prob2; //package name

public class Book { //Declaration of class Book
	private static int bookcount = 0; //Declaration of private static integer variable bookcount with the value of 0
	private String Bookname; //Declaration of private String variable Bookname
	private int id; //Declaration of private integer id
	
	public Book(String name) { //Declaration of Book method(constructor) with the parameter of a String value
		
		this.Bookname = name; //Insert the value of Name into Bookname
		bookcount++; //Increment the value of bookcount by 1
		this.id = bookcount; //Insert the value of bookcount into id
	}
	
	public void printInfo() { //Declaration of printInfo
		
		System.out.print("<<BOOKS>>\n" + this.toString()); // prints out the info and the returned string of the method String
	}
	
	public String toString() { //Declaration of toString method
		
		return "\tId: " + id + "\n\tBook Name: " + Bookname; //returns the string value and the value of Bookname
	}
}
