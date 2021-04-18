package com.testqn5;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;
public class HashtableEntry4 {
	public static void main(String[] args) {
		 Hashtable<Integer,String> ht = new Hashtable<>();		
	        ht.put(5,"Tom");
	        ht.put(2,"Sam");
	        ht.put(3,"Jhon");
	        ht.put(9,"Vicky");
	        ht.put(7,"Ram");	
	        
	        Set<Entry<Integer,String>> ent=ht.entrySet();
	        for(Entry<Integer,String> e:ent) {
	        	System.out.println(e.getKey()+"-"+e.getValue());
	        }
	        Set<Integer> setOfKeys = ht.keySet();
	        System.out.println("Iterator");
	        Iterator<Integer> itr = setOfKeys.iterator();	  	      
	        while (itr.hasNext()) {	  	           
	            int key = itr.next();	  	            
	            System.out.println("Key:"+key+" "+"Name:"+ ht.get(key));
	        }
	}
}
