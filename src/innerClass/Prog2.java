package innerClass;

/*
 * This class demonstrates about local inner class.
 */
public class Prog2 {

	public void diplay(){

		class localInnerClass{

			public void sum(){
				System.out.println("The sum of number is found here");
			}
		}
		localInnerClass obj = new localInnerClass();
		obj.sum();
	}


	public static void main(String[] args){

		Prog2 outObj = new Prog2();
		outObj.diplay();
	}
}

