package edu.handong.csee.java.lab13.prob1; //package name
/**
 * This is the main class for prob1
 * 
 * @author Kim Myung Jin 21400082
 *
 */
public class Mainclass { //declaration of main class

	public static void main(String[] args) { //main 
		// TODO Auto-generated method stub
		
		Friend friend1 = new Friend(); //initiate friend1 of class Friend
		SchoolFriend friend2 = new SchoolFriend(); //initiate friend2 of class SchoolFriend
		ClassFriend friend3 = new ClassFriend(); //initiate friend3 of class ClassFriend
		
		InstanceOf.whatFriend(friend1); //runs whatFriend method of class InstanceOf with the parameter of Friend friend1 
		InstanceOf.whatFriend(friend2); //runs whatFriend method of class InstanceOf with the parameter of SchoolFriend friend2
		InstanceOf.whatFriend(friend3); //runs whatFriend method of class InstanceOf with the parameter of ClassFriend friend3 

	}

}
