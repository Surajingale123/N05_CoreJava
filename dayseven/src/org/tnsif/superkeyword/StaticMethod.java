package org.tnsif.superkeyword;

public class StaticMethod {
	int x=2;
	static String collegename="MET";
	//if any method is outside the main function and if you want to access that method inside main function
	//we have to make that method as static
	
	//static method-----------------
	public static void print() {
		System.out.println(collegename);
		//we cannot use non-static var inside any static method
		//System.out.println(x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print();

	}

}