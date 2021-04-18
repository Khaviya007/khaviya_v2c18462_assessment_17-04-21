package com.testqn8;
import java.util.HashMap;
import java.util.Iterator;
public class Hashmap5 {
	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();    
		   map.put(1,"Tom");    
		   map.put(3,"Ram");    
		   map.put(2,"Sam");   
		   map.put(4,"Jhon");   
		       
		   System.out.println("The elements are: "); 
		   Iterator <Integer> it = map.keySet().iterator();        
			while(it.hasNext())  
			{  
				int key=(int)it.next();  
				System.out.println("Roll no:"+key+" "+"name:"+" "+map.get(key));  
			}  
	}
}
