package innerClass;


/*
 * This program demonstates about static inner class
 * 
 */
public class Prog4 {

	public static int a = 20;
	
	static class StatClass {
		
		public void display() {
			System.out.println("Value of a: "+a);
		}
		
		public static void statMethod(){
			System.out.println("Static method does not need object to be called");
		}
	}

	
	public static void main(String[] args){
	
		Prog4.StatClass obj = new Prog4.StatClass();
		obj.display();
		
		Prog4.StatClass.statMethod();
	}
	
}
