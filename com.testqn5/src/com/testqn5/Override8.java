package com.testqn5;
import java.io.IOException;
class Parent{  
	 void show()
	{
		System.out.println("parent");
	}  
}  			  
public class Override8 extends Parent{  	
		public void show() 
		{  
			System.out.println("subclass show method");  
		} 		
public static void main(String args[]) throws Exception{  
	Parent p=new Override8();  
	p.show();  			    
	}
}


