package com.testqn8;
import java.util.ArrayList;
import java.util.LinkedList;
public class LinkArray4 {
public static void main(String[] args) {
		 LinkedList<String> linkedlist = new LinkedList<String>();
		    linkedlist.add("Harry");
		    linkedlist.add("Jack");
		    linkedlist.add("Tom");
		    linkedlist.add("Ram");
		    linkedlist.add("Sam");
		    System.out.println("linked list:"+linkedlist);

		    ArrayList<String> list = new ArrayList<String>(linkedlist);
            System.out.println("Array list is:");
		    for (String str : list){
		      System.out.println(str);
		    }

	}

}
