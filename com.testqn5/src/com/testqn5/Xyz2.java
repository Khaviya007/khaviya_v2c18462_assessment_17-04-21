package com.testqn5;
public class Xyz2 {
	public static boolean Rotation(String st1, String st2) {  
        return (st1.length() == st2.length()) &&((st1+st1).indexOf(st2)!=-1);               
        }       
    public static void main(String[] args) {  
        String str1 = "XYZ";  
        String str2 = "YXZ";          
        if (Rotation(str1, str2)) {  
            System.out.println("rotation");  
        } else {  
            System.out.println("not rotation");  
        }  
    }  
}
