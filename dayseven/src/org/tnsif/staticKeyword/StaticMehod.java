package org.tnsif.staticKeyword;

public class StaticMehod {
 int x=2;
 static String collegename="MET";
// if any method outside the main function and of you want to access thet method
// inside main function ,we have to make 
// that method as a static
 
 public static void print() {
	 /*we can't use non-static variable inside any static method
	  * system.out.println(x);
	  */
	 System.out.println(collegename);
	
 }
	public static void main(String[] args) {
		print();
		
	}

}
