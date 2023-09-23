package org.tnsif.superkeyword;
class Sports{
	String sportsName="Cricket";
	void display(){
		System.out.println("Sports name is :"+sportsName);
	}
	
}
class Cricket extends Sports{
	int noOfPlayers=11;
	void display(){
		
		//super.methodName();
		super.display();
			System.out.println("Sports name is :"+noOfPlayers);
		}
		
		
		
	
	
	
	
}
public class SuperKeywordWithMethod {

	public static void main(String[] args) {
	 Cricket c=new Cricket();
	 c.display();

	}

}
