package com.set;

import java.util.Set;
import java.util.HashSet;

public class HashSetDemo {
	public static void main (String args[]) {
		//creating hashset
	 Set<String> set= new HashSet<String>();
	 set.add("Kathmandu");
	 set.add("Chitwan");
	 //duplicate elements are ignored
	 set.add("Pokhara");
	 set.add("Birjung");
	 set.add("Dharan");
	 set.add("Pokhara");
	 set.add(" ");

	 System.out.println("Cities of Nepal : ");
	 for(String s:set)
		 System.out.println(s);

	 
	 
	 
	}
	

}
