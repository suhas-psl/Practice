package Patterns;


/**
 * 1
 * 1 2 1
 * 1 2 3 2 1
 * 1 2 3 4 3 2 1
 * 1 2 3 2 1
 * 1 2 1
 * 1

 */
public class Prog7 {

	public static void main(String[] args){
		
		int i, j;
		
		for(i=1; i<=5; i++){
			for(j=1; j<=i; j++){
				System.out.print(j+" ");
			}
			j=j-2;
			while(j>0){
				System.out.print(j+" ");
				j--;
			}
			System.out.println();
		}
		i=i-2;
		while(i>0){
			for(j=1; j<=i; j++){
				System.out.print(j+" ");
			}
			j=j-2;
			while(j>0){
				System.out.print(j+" ");
				j--;
			}
			System.out.println();
			i--;
		}
		
	}
}
