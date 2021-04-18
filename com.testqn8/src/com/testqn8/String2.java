package com.testqn8;

public class String2 {
	public static void main(String[] args) {	
		String s1 = "Java";       
        String s2 = "Language";       
        int res=s1.compareTo(s2);           
        System.out.println(s1.compareTo(s2));      
        if(res==0)
        	System.out.println("Both strings are same");
        else if(res>1)
        	System.out.println("Greater");
        else
        	System.out.println("Lesser");
	}
}
