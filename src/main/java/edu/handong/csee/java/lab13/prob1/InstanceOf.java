package edu.handong.csee.java.lab13.prob1; //package name

public class InstanceOf { //declaration of class InstanceOf
	
	public static void whatFriend(Friend friend) { //static method whatFriend with the parameter of Friend variable
		
		if(friend instanceof ClassFriend) ((ClassFriend)friend).classFriend(); 
		//runs if statement if variable friend is an instance of class ClassFriend. Then method classFriend of class ClassFriend is carried out 
		
		else if (friend instanceof SchoolFriend) ((SchoolFriend)friend).schoolFriend(); 
		//runs if statement if variable friend is an instance of class SchoolFriend. Then method schoolFriend of class SchoolFriend is carried out 
		
		else ((Friend)friend).justFriend();
		//runs if above if statements are all not carried out. Then method justFriend of class Friend is carried out 
	} 

}
