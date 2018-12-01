package Patterns;

/**
 1
 2 2 
 3 3 3
 4 4 4 4
 5 5 5 5 5
 6 6 6 6 6 6
 */
public class Prog2 {

	public static void main(String[] args){
		
		int i, j;
		for(i=1; i<7; i++){
			for(j=0; j<i; j++){
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
