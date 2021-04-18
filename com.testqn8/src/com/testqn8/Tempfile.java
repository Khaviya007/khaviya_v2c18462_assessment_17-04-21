package com.testqn8;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Tempfile {
public static void main(String[] args) {
	File temp;
    try
    {
       temp = File.createTempFile("myTempFile", ".txt");
       System.out.println("file created sucessfully");

       BufferedWriter bw = new BufferedWriter(new FileWriter(temp));
       bw.write("Java is a platform indepent");
       bw.close();
       try(BufferedReader br=new BufferedReader(new FileReader(temp))){
    	   String line;
    	   while((line=br.readLine())!=null) {
    		   System.out.println(line);
    	   }
       }
    } catch (IOException e)
    {
       e.printStackTrace();
    }
 }

}
