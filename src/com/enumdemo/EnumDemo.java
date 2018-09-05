package com.enumdemo;
import java.util.*;  
enum workdays {  
  SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
}  
public class EnumDemo {  
  public static void main(String[] args) {  
    
	  Set<workdays> set1 = EnumSet.allOf(workdays.class);  
      System.out.println("work Days:"+set1);  
    
      Set<workdays> set2 = EnumSet.noneOf(workdays.class);  
      System.out.println("no Days:"+set2); 
    
      Set<workdays> set = EnumSet.of(workdays.TUESDAY, workdays.WEDNESDAY);  
      System.out.println("important Days:"+set); 

  }  
}  
