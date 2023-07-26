
//program to demonstrate access specifier
package org.tnsif.accessspecifire;

public class Bank {

//	different access specifier
	public String BankName;
	private int pinNo;
	long accountNo=647477464738736L;
	
	public void displayPublic()
	{
		System.out.println("Bank Name is: "+ BankName);
	}
	
	private void displayPrivate() {
		System.out.println("Pin No is: "+pinNo);
	}
	
	void displayDefault() {
		System.out.println("Account No is: "+accountNo);
	}

}
