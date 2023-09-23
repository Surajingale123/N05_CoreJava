package org.tnsif.thiskeyword;
//this can be passed as argument in the constructor call
public class ThisKeywordDemoTwo {

	int x,y;
	
	public ThisKeywordDemoTwo(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		
	}

	public void display() {
	System.out.println(x+ " "+y);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisKeywordDemoTwo t=new ThisKeywordDemoTwo(2,3);
		
		t.display();
		
	}

}


