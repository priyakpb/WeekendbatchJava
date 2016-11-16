package javacollection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> countries = new LinkedList<>();
		
		countries.add("China");
		countries.add("India");
		countries.add("US");
		countries.add("China");
		
		
		
		
		Iterator<String> itr =countries.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
