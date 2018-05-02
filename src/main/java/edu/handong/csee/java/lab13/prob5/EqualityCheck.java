package edu.handong.csee.java.lab13.prob5; //package name

public class EqualityCheck { //declaration of class EqualityCheck
	
	public static boolean equals(int[][] a, int[][] b) { //declaration of static method equals with parameters of two 2D arrays
		
		int count = 0; //declaration of integer variable count
		
		if(a.length != b.length) return false; //if the number of row of a array and number of row of b array is different then return false 
		
		for(int i = 0; i < a.length; i++) { 
			//continues the loop until i is not smaller than the number of rows of a array (i starts with 0 and increments by 1 every loop)
			for(int j = 0; j < b.length; j++) {
				//continues the loop until j is not smaller than the number of rows of a array (j starts with 0 and increments by 1 every loop)
				
				if(a[i][j] != b[i][j]) count++; //if the value of a[i][j] and b[i][j] is different then increment the value of count by 1
			}
		}
		
		if(count <= 3) return true; //if the value of count is smaller or same with 3 then return true
		else return false; //if the if statements does not run then return false
	}

}
