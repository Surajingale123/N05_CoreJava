package org.tnsif.classandobjects;

public class CitizenExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Citizen c= new Citizen();
		c.aadharNo=123456789012L;
		c.citizenType="Adult";
		c.city="Nashik";
		c.gender="Male";
		
		Citizen c1= new Citizen("Adult",123456789012L,"Male","Nashik");
		System.out.println(c1);
	}

}
