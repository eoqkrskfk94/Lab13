package edu.handong.csee.java.lab13.prob4; //package name
import java.util.Scanner; //imports Scanner of java utility 

public class prob4 { //main class

	public static void main(String[] args) {
		String catName, dogName; //declaration of String variable catName and dogName 
		
		Master master = new Master(); //initiation of master of Master class
		Cat cat = new Cat(); //initiation of cat of Cat class
		Dog dog = new Dog(); //initiation of dog of Dog class
		
		Scanner input = new Scanner(System.in); //creates scanner for insertion
		System.out.print("Enter the cat name and the dog name: "); //prints out info
		catName = input.next(); //put the inserted value to catName
		dogName = input.next(); //put the inserted value to dogName

		cat.setName(catName); //run setter method of cat with the parameter of catName
		dog.setName(dogName); //run setter method of dog with the parameter of dogName
		cat.getName(); //run getter method of cat
		master.feed(cat); //run feed method of master with the parameter of cat
		dog.getName(); //run getter method of dog
		master.feed(dog); //run feed method of master with the parameter of dog
	}

}
