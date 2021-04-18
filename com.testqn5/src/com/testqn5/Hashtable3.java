package com.testqn5;
import java.util.Set;
import java.util.Hashtable;
import java.util.Iterator;
public class Hashtable3 {
	public static void main(String[] args) {
		Hashtable<String, String> hashtable = new Hashtable<String, String>();		
		hashtable.put("2","Jai");
		hashtable.put("3","Tom");
		hashtable.put("1","Sam");	 
		System.out.println(hashtable);
		 Set<String> setKeys = hashtable.keySet();	  	        
	        Iterator<String> itr = setKeys.iterator();	  	      
	        while (itr.hasNext()) {	  	           
	            String key = itr.next();	  	            
	            System.out.println("Key:"+key+" "+"Name:"+ hashtable.get(key));}
	}
}
