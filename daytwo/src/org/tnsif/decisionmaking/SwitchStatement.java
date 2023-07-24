package org.tnsif.decisionmaking;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		Scanner s=new Scanner(System.in);
		int map=s.nextInt();
		
		switch(map){
		case 1:
			System.out.println("livik");
			break;
		case 2:
			System.out.println("Nusa");
			break;
		case 3:
			System.out.println("Erangal");
			break;
		case 4:
			System.out.println("Miamar");
			break;
		case 5:
			System.out.println("Wikende");
			break;
			default:
				System.out.println("Invalid map");
		
			
		}
		s.close();
		
	
	}

}
