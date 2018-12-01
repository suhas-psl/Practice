package collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListProg1 {

	public static void main(String[] args){
		
		
		List<Integer> array1 = new ArrayList<Integer>();
		array1.add(11);
		array1.add(22);
		array1.add(10);
		
		System.out.println("The array is: "+array1);
		
		for(Integer i : array1){
			System.out.println("-"+i);
		}
		
		Iterator<Integer> itr1 = array1.iterator();
		while(itr1.hasNext()){
			System.out.println("+"+itr1.next());
		}
		
		List<Integer>array2 = new ArrayList<Integer>();
		array2.add(121);
		array2.add(11);
		array2.add(131);
		
		array1.addAll(array2);
		
		Iterator<Integer> itr2 = array1.iterator();
		while(itr2.hasNext()){
			System.out.println("*"+itr2.next());
		}
		
		array1.removeAll(array2);
		Iterator<Integer> itr3 = array1.iterator();
		while(itr3.hasNext()){
			System.out.println("%"+itr3.next());
		}
		
	}
	
}
