package Patterns;

import java.util.Scanner;

/**
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
1 2 
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6 

 */


public class Prog6 {

	public static void main(String[] args){
		
		System.out.print("Enter the desired number: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int i, j;
		for(i=num; i>1; i--){
			for(j=1; j<=i; j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
		while(i<=num){
			for(j=1; j<=i; j++){
				System.out.print("*"+" ");
			}
			i++;
			System.out.println();
		}
	}
}
