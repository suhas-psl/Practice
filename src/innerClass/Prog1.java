package innerClass;


/*
 * This class demonstrates member inner class
 */



public class Prog1 {

	private int a = 50;
	
	class InnerClass {
		
		public void display(){
			System.out.println("The value of a is: "+a);
		}
	}
	
	public static void main(String[] args) {
		
		Prog1 obj1 = new Prog1();
		
		Prog1.InnerClass innerObj = obj1.new InnerClass();
		
		innerObj.display();
	}
	
}
