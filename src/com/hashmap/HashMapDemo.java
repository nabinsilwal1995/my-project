package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String args[]) {
		
		Map<String,Integer> mp= new HashMap<>();
		mp.put("Hari", 10);
		mp.put("Binod", 20);
		mp.put("John", 30);
		mp.put("Binod",40);
		 for(Map.Entry<String,Integer> m:mp.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
			  }  
		}
	}


