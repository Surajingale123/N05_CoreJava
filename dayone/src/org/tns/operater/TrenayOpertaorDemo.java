package org.tns.operater;

import java.util.Scanner;

public class TrenayOpertaorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 
//		Scanner s=new Scanner(System.in);
//		int num=s.nextInt();
//		String res=(num%2==0)?"Even":"Odd";
//		System.out.println("Result is:"+res);
//		s.close();
		
		
		Scanner s=new Scanner(System.in);
		int num1=s.nextInt();
		int num2=s.nextInt();
		
		if(num1>=18 && num2>=50 ) {
			System.out.println("you can donate blood");
		}else {
			System.out.println("not donate");
		}
		
//		
//		String res=(num1>=18)?"Eligible":"Not Eligible";
//        System.out.println("You are:"+res);
//		
//        String ress=(num2>=18)?"Eligible":"Not Eligible";
//        System.out.println("You are:"+ress);
		s.close();
//		
		
	}

}
