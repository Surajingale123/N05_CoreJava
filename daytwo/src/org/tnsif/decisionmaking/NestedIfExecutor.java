package org.tnsif.decisionmaking;

import java.util.Scanner;

public class NestedIfExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int age=s.nextInt();
		int weight=s.nextInt();
		
		if(age>=12) {
			
			if(weight>=40) {
				System.out.println("Eligible to bunjee jumping");
				if(weight>110){
					System.out.println("extra roop will added");
				}
				
			}
			else {
				System.out.println("Not eligible");
			}
		}
		else {
			System.out.println("not eligible");
		}
		

	}

}
