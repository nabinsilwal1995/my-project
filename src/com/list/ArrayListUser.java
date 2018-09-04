package com.list;

import java.util.ArrayList;
import java.util.List;

class Items {
	int id;
	int age;
	String name;
	Items(int id,int age,String name){
		this.id=id;
		this.age=age;
		this.name=name;		
			}

}
public class ArrayListUser{
	public static void main(String arg[]){
	 List<Items> list=new ArrayList<Items>();  
	  Items i1=new Items(1,24,"Nabin Silwal");  
      Items i2=new Items(1,43,"John Daneil");  
	  Items i3=new Items(1,26,"kevin Ross");  
		    list.add(i1);  
		    list.add(i2);  
		    list.add(i3);  
		    for(Items b:list){  
		    System.out.println(b.id+" "+b.age+" "+b.name);  
		    }  
}
}