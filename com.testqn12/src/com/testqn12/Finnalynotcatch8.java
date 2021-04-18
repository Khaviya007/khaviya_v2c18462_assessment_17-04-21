package com.testqn12;
public class Finnalynotcatch8 {
	public static void main(String[] args) {
		int a=0,b=10 ;
	      int c;
	      try {
	         c = b/a;
	         System.out.println("c value is:"+c);
	      } 
	      finally {
	    	  System.out.println("Finally block is execued");
	      }
	}
}
