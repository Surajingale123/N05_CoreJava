//circle n people and k person killed k-1 skipped question

package org.tnsif.challenges;

import java.util.Scanner;

public class CircleChallenge {
	
	static int survive(int n,int k) {
		
		if(n==1)
			return 1;
	
	else
		return(survive(n-1,k)+k-1)%n+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		
		System.out.println(survive(n,k));

	}

}
//
