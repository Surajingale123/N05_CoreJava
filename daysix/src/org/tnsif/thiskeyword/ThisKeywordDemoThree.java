package org.tnsif.thiskeyword;

public class ThisKeywordDemoThree {

	void print(ThisKeywordDemoThree t) {
		System.out.println("hey there i am using this Keyword");
	}
	
	void display() {
		/*when you call any parameterized method inside
		 * non-paramerized method then,we get an error
		 * the overcome that we have to use this keyword as an argument
		 * in method call
		 */
		print (this);
	}
	
	public static void main(String[] args) {
		ThisKeywordDemoThree t=new ThisKeywordDemoThree();
		t.display();

	}

}
