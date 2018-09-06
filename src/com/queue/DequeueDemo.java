package com.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueDemo {
	public static void main(String[] args) {  
	    Deque<String> d=new ArrayDeque<String>();  
	    d.offer("jash");  
	    d.offer("andrew");  
	    d.add("nash");  
	    d.offerFirst("john"); 
	    d.offerLast("roy");
	    System.out.println("After offerFirst ...");  
	    for(String s:d){  
	        System.out.println(s);  
	    }  
	    //deque.poll();  
	      
	    d.pollLast();  
	    System.out.println("After pollLast .. "
	    		+ "...");  
	    for(String s:d){  
	        System.out.println(s);  
	    }  
	}  

}
