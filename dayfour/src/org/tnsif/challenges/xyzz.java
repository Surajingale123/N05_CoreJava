
/* ask a used a birth year encoded as 2 digit ("62") and for the current year ,also encoded as 2  digit ("99")
 * write a program to find the users current age in yearsmm
 * 
 */

package org.tnsif.challenges;

import java.util.Scanner;

public class xyzz {
	
	
	static void year(int BY,int CY) {
		if(CY>23) {
			System.out.println(CY-BY);
		}
		else {
			System.out.println(100-BY+CY);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner s=new Scanner(System.in);
		int BY=s.nextInt();
		int CY=s.nextInt();

		
		year(BY,CY);
		s.close();
	}

	
	
	/*Write a program to calcute the hotel tariff. The room rent is 12% high during peak seasons
	 * (april -june and nov-dec)
	 * 
	 * use switch cases
	 * input month=3;
	 * rent rent=1500;
	 * day = 2;
	 * 
	 * calculate hotel budget;
	 * 
	 */
	
	
	/*A microwave oven manufacture recomends that when hitting 2 items, at 50% to the hitting time 
	 * and when hitting 3 item double the hitting time.Hitting more then 3 items at ones is not recommended
	 * write a program to find out the recomended hitting time
	 * 
	 * sample input
	 * item=2
	 * hitting time=5.0
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	 
}
