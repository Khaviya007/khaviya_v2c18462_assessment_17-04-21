package com.testqn12;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;
public class Linkedhshmap6 {
	public static void main(String[] args) {
		 LinkedHashMap<Integer, String> lhmap =new LinkedHashMap<Integer, String>();       
         lhmap.put(5, "Tom");
         lhmap.put(7, "Sam");
         lhmap.put(1, "Ram");
         lhmap.put(2, "Jhon");         
        
         Set set = lhmap.entrySet();         
         Iterator iterator = set.iterator();
         while(iterator.hasNext()) {
            Map.Entry me = (Map.Entry)iterator.next();
            System.out.print("Key is:"+ me.getKey()+" "+"and Value is:"+me.getValue()+"\n");
         }
	}
}
