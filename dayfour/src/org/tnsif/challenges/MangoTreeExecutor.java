package org.tnsif.challenges;

import java.util.Scanner;

/*pratik is so much intrested in garden. he plant more tree in his garden he plant tree in rectangular
 *  patern in numder of row and coloumn and numbers the trees in row wise order. he planted the mango
 *   tree only in the first row and first coloumn and last coloumn so you have given tree number and rows and
 *  coloumn your task is to find out whether the given tree is mango tree or not 
input n=5; t=11; 
*/
public class MangoTreeExecutor {

   static void isManagoTree(int N,int T) {
		if(T%N==0 || T%N==1 ||T<=N) {
			System.out.println("Mango tree");
		}
		else {
			System.out.println("not mango");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int T=s.nextInt();
		
		isManagoTree(N,T);
		
	}

}
