//program to demonstrate on Encapsulation
/*encapsultion achive the data hiding using private access specifier*/
package org.tnsif.encapsulation;

public class HDFC {
	
	private long accountNo;
	private int cvvNo;
	private String accountType;
	private int pinNo;
	
	
	/*getter:-
	 * setter:-
	 * 
	 * 
	 * */
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public int getCvvNo() {
		return cvvNo;
	}
	public void setCvvNo(int cvvNo) {
		this.cvvNo = cvvNo;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public int getPinNo() {
		return pinNo;
	}
	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}
	@Override
	public String toString() {
		return "HDFC [accountNo=" + accountNo + ", cvvNo=" + cvvNo + ", accountType=" + accountType + ", pinNo=" + pinNo
				+ ", getAccountNo()=" + getAccountNo() + ", getCvvNo()=" + getCvvNo() + ", getAccountType()="
				+ getAccountType() + ", getPinNo()=" + getPinNo() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}
