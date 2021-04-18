package com.testqn8;
public class Divzero7 {
	public static void main(String[] args) {
		try {
            int number[] = new int[20];
            number[21] = 20 / 0;          
        }
        catch (ArrayIndexOutOfBoundsException
               | ArithmeticException e) {
            System.out.println(e);           
        }
	}
}
