package Patterns;

/**
1
2 2 
3 3 3
4 4 4 4
5 5 5 5 5
6 6 6 6 6 6
5 5 5 5 5
4 4 4 4 
3 3 3
2 2 
1

 */

public class Prog4 {

	public static void main(String []args){

		int i, j;

		for(i=1; i<6; i++){
			for(j=0; j<i; j++){
				System.out.print(i+" ");
			}
			System.out.println();
		}
		while(i>0){
			for(j=0; j<i; j++){
				System.out.print(i+" ");
			}
			i--;
			System.out.println();
		}
	}
	
}
