package org.tnsif.staticKeyword;

public class StaticBlockExecutor {

	static float salary=682.852f;
	String companyName;
	/*
	 * static block is used to initialize the static variable
	 * we can't assign a value for any non static variable inside
	 * the static block
	 */
	
	static {
		//companyNmae ="tcs";
		salary =237557.3535f;
	}
	
	static void print(){
		System.out.println(salary);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          print();
	}

}
