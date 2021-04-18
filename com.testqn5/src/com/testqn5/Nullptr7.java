package com.testqn5;
import java.util.Optional;
public class Nullptr7 {
	public static void main(String[] args) {
		String s[]=new String[10];
		Optional<String> c=Optional.ofNullable(s[1]);
		if(c.isPresent())
		{
			String up=s[1].toUpperCase();
			System.out.println(up);
		}
		else
		{
			System.out.println("String not present");
		}

	} 
}
