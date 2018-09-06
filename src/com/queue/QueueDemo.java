package com.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo {
	public static void main(String args[]){  
		//creating queue list
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		queue.add("First man");  
		queue.add("Second man");  
		queue.add("Third man");  
		queue.add("Fourth man");  
		queue.add("Fifth man");  
		
		System.out.println("head:"+queue.element());  
		System.out.println("head:"+queue.peek());  
		System.out.println("iterating the queue elements:");  
		
		Iterator itr=queue.iterator();  
	    while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		queue.remove();  
		queue.poll();  
		System.out.println("after removing two elements:");  
		Iterator<String> itr2=queue.iterator();  
		while(itr2.hasNext()){  
		System.out.println(itr2.next());  
		}  
		}  

}
