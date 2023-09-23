package org.tnsif.superkeyword;
class State{

	String statename="Panjab";
	String captial="Panaji";
	
	
	
	
}

class Capital extends State{

			String statename="Hariyana";
	String captial="Chandigarh";
	
	
	/*Super keyword with variable is used to call parent class
	 * variable if and only if parent and child class variable name 
	 * are same.
	 */
	public void display() {
		System.out.println(super.statename);
		System.out.println(statename);
	}
}

//driver class
public class SuperKeywordWithVariable {

	public static void main(String[] args) {
	
		Capital c=new Capital();
	     c.display();
		
	}

}
