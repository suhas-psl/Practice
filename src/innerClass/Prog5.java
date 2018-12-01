package innerClass;



/*
 * This program demonstates nested interface inside a class
 * 
 */
public class Prog5 {

	public interface nestedInter{
		void dispMethod();
	}
}

class TestNested implements Prog5.nestedInter{
	
	public void dispMethod(){
		System.out.println("Implemted the method");
	}
	
	public static void main(String[] args){
		
		Prog5.nestedInter obj = new TestNested();
		obj.dispMethod();
	}
}
