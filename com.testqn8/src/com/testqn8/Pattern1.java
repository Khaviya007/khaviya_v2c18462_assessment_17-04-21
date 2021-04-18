package com.testqn8;
import java.util.Scanner;
public class Pattern1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);		
		System.out.println("Enter rows");
		int n=sc.nextInt();						
		 int i,j,num=1,s;		 
	        s=n-1;	 
	        for(j=1;j<=n;j++)
	        {
	        num=j;	         
	        for(i=1;i<=s;i++)
	            System.out.print(" ");	         
	         s--;	         
	        for(i=1;i<=j;i++)
	        {
	            System.out.print(num);
	            num++;
	        }
	        num--;
	        num--;
	        for(i=1;i<j;i++)
	        {
	            System.out.print(num);
	            num--;
	        }
	        System.out.println();
	        }
	}
}
