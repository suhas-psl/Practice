package multithreading;

public class Prog1 extends Thread {

	public void run(){
		System.out.println("IN the run method");
	}
	
	public static void main(String[] args){
		
		Prog1 pr = new Prog1();
		pr.start();
	}
}
