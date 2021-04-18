package com.testqn8;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Filecreate2 {
	public static void main(String[] args) {			
		try {
		      File myObj = new File("C:\\Users\\khav2c18462\\eclipse-workspace17\\com.testqn8\\src\\com");
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } 
		    		
	        FileWriter myWriter = new FileWriter("filename.txt");
	        myWriter.write("i am in java training");
	        myWriter.close();
	        System.out.println("Successfully wrote to the file.");
	        try {
		        File myObj1 = new File("C:\\Users\\khav2c18462\\eclipse-workspace17\\com.testqn8\\src\\com");
		        Scanner myReader = new Scanner(myObj1);
		        while (myReader.hasNextLine()) {
		          String data = myReader.nextLine();
		          System.out.println(data);
		        }
		       
		}catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
			
		}
		catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		  
	}
}
