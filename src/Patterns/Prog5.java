package Patterns;

import java.util.Scanner;

/**
7 6 5 4 3 2 1
7 6 5 4 3 2
7 6 5 4 3
7 6 5 4
7 6 5
7 6
7 

 */
public class Prog5 {

	public static void main(String[] args){
		
		System.out.println("Enter the number: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		for(int i=1; i<=num; i++){
			for(int j=num; j>=i; j--){
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
//		int i, j;
//		
//		for(i= 0; i< scan.nextInt(); i++){
//			for(j=scan.nextInt(); j>i; j--){
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
	}
}
