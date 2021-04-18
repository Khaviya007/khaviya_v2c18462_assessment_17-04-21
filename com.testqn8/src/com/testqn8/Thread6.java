package com.testqn8;

public class Thread6 implements Runnable{
	public static void main(String[] args) {
		Thread6 object=new Thread6();
		Thread thread=new Thread(object);
		thread.start();
		System.out.println("Not run method");
	}
	public void run()
	{
		System.out.println("Run method & thread running");
	}

	}


