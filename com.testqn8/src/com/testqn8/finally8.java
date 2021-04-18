package com.testqn8;
public class finally8 {
	public static void main(String[] args) {
		int a=2,b=10 ;
	      int c;
	      try {
	         c = b/a;
	         System.out.println("c value is:"+c);
	      } catch (ArithmeticException e) {
	         e.printStackTrace();
	         System.out.println("ArithmeticException");
	      }
	      finally {
	    	  System.out.println("Finally block is execued");
	      }

	}

}
