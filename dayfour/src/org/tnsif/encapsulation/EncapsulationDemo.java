//program to demonstrate on Encapsulation
/*encapsultion achive the data hiding using private access specifier*/

package org.tnsif.encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HDFC h=new HDFC();
		h.setAccountNo(254582482648L);
		h.setAccountType("Current Account");
		h.setCvvNo(233);
		h.setPinNo(1221);
		
////		accessing and printing all the private members
//		System.out.println(h.getAccountNo());
//		System.out.println(h.getAccountType());
//		System.out.println(h.getCvvNo());
//		System.out.println(h.getPinNo());
		
		System.out.println(h);
	}

}
