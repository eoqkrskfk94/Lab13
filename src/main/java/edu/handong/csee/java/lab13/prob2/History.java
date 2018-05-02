package edu.handong.csee.java.lab13.prob2; //package name

public class History extends Book{ //class History inherits class Book
	private String author; //declaration of String variable author

	public History(String name, String author) { //declaration of constructor History with the parameter of String name and String author
		super(name); //Run super class constructor with the parameter of String variable name
		this.author = author; //Insert author value to author of the class
	}

	public String toString() { //declaration of method toString

		return super.toString() + "\n\tAuthor: " + this.author; 
		//returns string value (returned string value from the super class toString method and the rest )
	}

	public void printInfo() { //declaration of method printInfo

		System.out.print("\n<<HISTORY>>\n" + this.toString()); //prints out the info 
	}

}
