// for loop and enhanced for loop

package org.tnsif.looping;

import java.util.Scanner;

public class ForLoopExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
//
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//			System.out.print("*");
//			}
//			System.out.println();
//		}
		char arr[]= {97,98,99};
		
		for(char c:arr) {
			System.out.println(c+" ");
		}
		
		
		s.close();
	}

}
