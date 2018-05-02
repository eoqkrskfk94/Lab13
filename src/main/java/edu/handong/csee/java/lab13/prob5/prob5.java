package edu.handong.csee.java.lab13.prob5; //package name
import java.util.Scanner;

public class prob5 { //main class

	public static void main(String[] args) {
		
		int n1, n2; //declaration of integer variables n1 and n2
		Scanner input = new Scanner(System.in); //creates scanner for insertion
		
		System.out.print("Enter row size (maximum 5): "); //prints out info
		n1 = input.nextInt(); //put the inserted value to n1
		
		System.out.print("Enter column size (maximum 5): "); //prints out info
		n2 = input.nextInt(); //put the inserted value to n2
		
		int[][] a = new int[n1][n2]; //create 2d array a with the row number of n1 and column number of n2
		
		System.out.print("Enter row size (maximum 5): "); //prints out info
		n1 = input.nextInt(); //put the inserted value to n1
		
		System.out.print("Enter column size (maximum 5): "); //prints out info
		n2 = input.nextInt(); //put the inserted value to n2
		
		int[][] b = new int[n1][n2]; //create 2d array a with the row number of n1 and column number of n2
		
		
		System.out.print("Enter list1: "); //prints out info
		
		for (int i = 0; i < a.length; i++)
			//continues the loop until i is not smaller than the number of rows of a array (i starts with 0 and increments by 1 every loop)
		    for (int j = 0; j < a[i].length; j++)
		    	//continues the loop until j is not smaller than the number of column in a[i] row (j starts with 0 and increments by 1 every loop)
		                a[i][j] = input.nextInt(); //puts the inserted value to a[i][j]
		
		
		System.out.print("Enter list2: "); //prints out info
		
		for (int i = 0; i < b.length; i++)
			//continues the loop until i is not smaller than the number of rows of a array (i starts with 0 and increments by 1 every loop)
		    for (int j = 0; j < b[i].length; j++)
		    	//continues the loop until j is not smaller than the number of column in a[i] row (j starts with 0 and increments by 1 every loop)
		                b[i][j] = input.nextInt(); //puts the inserted value to b[i][j]
		
		
		System.out.println(); //prints nextline
		for (int i = 0; i < a.length; i++){
			//continues the loop until i is not smaller than the number of rows of a array (i starts with 0 and increments by 1 every loop)
		    for (int j = 0; j < a[i].length; j++)
		    	//continues the loop until j is not smaller than the number of column in a[i] row (j starts with 0 and increments by 1 every loop)
		      System.out.print(a[i][j] + " "); //prints the a[i][j] value
		    System.out.println(); //prints nextline
		 } 
		 System.out.println(); //prints nextline
		 for (int i = 0; i < b.length; i++){
			//continues the loop until i is not smaller than the number of rows of a array (i starts with 0 and increments by 1 every loop)
		    for (int j = 0; j < b[i].length; j++)
		    	//continues the loop until j is not smaller than the number of column in a[i] row (j starts with 0 and increments by 1 every loop)
		      System.out.print(b[i][j] + " "); //prints the b[i][j] value
		    System.out.println(); //prints nextline
		 }
		 System.out.println(); //prints nextline
		 
		 
		 if(EqualityCheck.equals(a, b)) System.out.println("The two arrays are approximately identical!"); 
		 //if the equals method of EqualityCheck with the parameters of a and b returns true then print of the info
		 else System.out.println("The two arrays are not identical!"); ////if the if statements does not run then print out the info

		
		
		

	}

}
