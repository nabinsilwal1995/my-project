package com.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	public static void main(String args[]) {
		//creating array list
	List<Integer> li=  new ArrayList<>();
	//adding object in array list
	li.add(10);
	li.add(20);
	li.add(40);
	//iterating using for loop
	for( Integer l:li) 
	System.out.println(l);
	
	
  }
}
