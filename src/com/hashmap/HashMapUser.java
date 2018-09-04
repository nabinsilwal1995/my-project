package com.hashmap;


import java.util.HashMap;
import java.util.Map;

class Items {
	
	int age;
	String name;
	Items(int age,String name){
	
		this.age=age;
		this.name=name;		
			}

}
public class HashMapUser{
	public static void main(String arg[]){
	 
		Map<Integer,Items> mp=new HashMap<Integer,Items>();  
	  Items i1=new Items(34,"Nabin Silwal");  
      Items i2=new Items(33,"John Daneil");  
	  Items i3=new Items(21,"kevin Ross");  
		 
		    mp.put(1,i1);  
		    mp.put(2,i2);  
		    mp.put(3,i3);  
		    for(Map.Entry<Integer, Items> it:mp.entrySet()){    
		        int key=it.getKey();  
		        Items i=it.getValue();  
		      
		        System.out.println(key+" " + i.age+" " + i.name);   
		    }   
}
}
