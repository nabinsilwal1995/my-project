package com.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	 public static void main(String[] args) {
	        // creating a treeSet
	        Set<String> fruits = new TreeSet<>();

	        // Adding new elements 
	        fruits.add("Banana");
	        fruits.add("Apple");
	        fruits.add("Pineapple");
	        fruits.add("Orange");

	        System.out.println("Fruits Set : " + fruits);

	        // duplicate elements are ignored
	        fruits.add("Apple");
	        System.out.println("After adding duplicate element  : " + fruits);

	        // this is allowed coz its in lowercase.
	        fruits.add("banana");
	        System.out.println("After adding banana : " + fruits);
	    }
}
//gives result in ascending order