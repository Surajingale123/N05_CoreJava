package org.tnsif.accessspecifierdemo;
import org.tnsif.accessspecifire.Bank;
public class BankExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank b=new Bank();
		b.BankName="SBI";
		b.displayPublic();
		
		
/*	pin No and display private () method are private
	so we can"t access into another class and another package only we 
 * can access private data members inside  the same class
 */
//		b.pinNo;
//		b,display();
		
		/* accountNo and displayDefault()method are default that's why 
		 * we are not able to access into another package
		 * only we can access within the same package*/
		
//		b.accountNo;
//		b.displayDefault();
		
		
	}

}
