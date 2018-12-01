package innerClass;

/*
 * This class demonstrates Anonymous inner class
 */
public class Prog3 {

	public static void main(String[] args){

		SampleInter interObj = new SampleInter(){
			public void interDisplay(){
				System.out.println("Implementation in anonymous inner class - Interface");
			}
		};

		interObj.interDisplay();

		SampleAbstrct abstrctObj = new SampleAbstrct(){
			public void abDisplay(){
				System.out.println("Implementation of anonympus inner class - Abstract");
			}
		};
		abstrctObj.abDisplay();

		SampleClass classObj = new SampleClass(){
			public void display(){
				System.out.println("Implementation of sample inner class - Sample class");
			}
		};
		classObj.display();

	}
}
