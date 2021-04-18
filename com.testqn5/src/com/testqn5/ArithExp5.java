package com.testqn5;

public class ArithExp5 {

	public static void main(String[] args) {
		 int a=0,b=10 ;
	      int c;
	      try {
	         c = b/a;
	         System.out.println("c value is:"+c);
	      } catch (ArithmeticException e) {
	         e.printStackTrace();
	         System.out.println("ArithmeticException");
	      }	    
	   }
	}


