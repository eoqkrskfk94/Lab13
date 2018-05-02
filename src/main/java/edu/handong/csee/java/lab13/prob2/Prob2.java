package edu.handong.csee.java.lab13.prob2; //package name

public class Prob2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book1= new Book("Simple Book"); //instantiate book1 of class Book
		Science book2 = new Science("Hello Physics!", "ScienceWorld"); //instantiate book2 of class Science
		History book3 = new History("What Is history?", "E.H.Carr"); //instantiate book3 of class History
		History book4 = new History("The South Korea", "Judis"); //instantiate book4 of class History

		book1.printInfo(); //run printInfo method of book1
		book2.printInfo(); //run printInfo method of book2
		book3.printInfo(); //run printInfo method of book3
		book4.printInfo(); //run printInfo method of book4
	}

}
