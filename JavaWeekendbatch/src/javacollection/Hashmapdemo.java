package javacollection;

import java.util.HashMap;
import java.util.Map;

public class Hashmapdemo {
	
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> marks= new HashMap<>();
		
		marks.put("Ram", 98);
		marks.put("Tom", 99);
		marks.put("Vijay", 100);
		
		for(Map.Entry t: marks.entrySet()){
			
			System.out.println(t.getKey()+ "-" + t.getValue());
		}
		
		
		
		
	}
	
	

}
