package edu.handong.csee.java.lab13.prob6;//package name

public class UpPoint implements CapitalPrint{//declaration of class UpPoint that implements CapitalPrint class
	private int a, b;//declaration of private integer variables a and b

	public UpPoint(int a, int b){//declaration of constructor method with the parameters of a and b

		this.a = a;//insert the value of parameter a into a of this class
		this.b = b;//insert the value of parameter b into a of this class
	}

	public String toString() {//declaration of toString method

		return "x: " + a + " y: " + b;//returns the give string value  
	}



}




