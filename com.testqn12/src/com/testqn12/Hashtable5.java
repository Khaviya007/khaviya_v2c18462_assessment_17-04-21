package com.testqn12;
import java.util.Hashtable;
import java.util.Map;
public class Hashtable5 {
	public static void main(String[] args) {
		 Map<Integer, String> map =new Hashtable<Integer, String>();       
         map.put(5, "Tom");
         map.put(7, "Sam");
         map.put(1, "Ram");
         map.put(2, "Jhon");
         map.put(3, "Vicky");
         map.forEach((a,b)->System.out.println("Key:"+a+" "+"Value:"+b));
	}

}
