package edu.handong.csee.java.lab13.prob2; //package name

public class Science extends Book{ //class Science inherits class Book
	private String publisher; //declaration of String variable publisher
	
	public Science(String name, String publisher) { //declaration of constructor History with the parameter of String name and String publisher
		super(name); //Run super class constructor with the parameter of String variable Name
		this.publisher = publisher; //Insert publisher value to publisher of the class 
	}
	
	public String toString() { //declaration of method toString
		
		return super.toString() + "\n\tPublisher: " + this.publisher;
		//returns string value (returned string value from the super class toString method and the rest )
	}
	
	public void printInfo() { //declaration of method printInfo
		
		System.out.print("\n<<SCIENCE>>\n" + this.toString()); //prints out the info 
	}

}

