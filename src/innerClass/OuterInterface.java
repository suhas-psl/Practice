package innerClass;

/*
 * This program demonstrates nested interface inside a interface
 */

public interface OuterInterface {

	public interface InnerInterface{
		void msg();
	}
}

class TestInterface implements OuterInterface.InnerInterface{
	
	public void msg(){
		System.out.println("Implementing the interface");
	}
	
	public static void main(String[] args){
		
		OuterInterface.InnerInterface message = new TestInterface();
		message.msg();
	}
}