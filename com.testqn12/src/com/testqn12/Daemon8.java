package com.testqn12;
public class Daemon8  extends Thread{	
	public void run(){  
		  if(Thread.currentThread().isDaemon()){ 
		   System.out.println("daemon thread is working");  
		  }  
		  else{  
		  System.out.println("user thread is working");  
		 }  
      }  
	    public static void main(String[] args) 
	    {  
	        Daemon8 D1 = new Daemon8(); 
	        Daemon8 D2 = new Daemon8(); 
	        Daemon8 D3 = new Daemon8(); 

	        D1.setDaemon(true);        
	        D1.start(); 
	        D2.start();  
	        D3.start();       
	    }  
	}
		
	


