package Lessons;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SL_3_File_Handling {

	public static void main(String[] args) {
		
		// Creating an object of a file
		File myObj = new File("filename.txt");
		if (myObj.exists()) {
		// Returning the file name
		System.out.println("File name: " + myObj.getName());

		// Returning the path of the file
		System.out.println("Absolute path: " + myObj.getAbsolutePath());

		// Displaying whether the file is writable
		System.out.println("Writeable: " + myObj.canWrite());

		// Displaying whether the file is readable or not
		System.out.println("Readable " + myObj.canRead());

		// Returning the length of the file in bytes
		System.out.println("File size in bytes " + myObj.length());
		} else {
		System.out.println("The file does not exist.");
	
		}
		// File append
		try {
	         String data = " im a good learner";
	         File f1 = new File("E:\\eclipse Workspace\\SL-Projects\\filename.txt");
	         if(!f1.exists()) {
	            f1.createNewFile();
	         }

	         FileWriter fileWritter = new FileWriter(f1.getName(),true);
	         BufferedWriter bw = new BufferedWriter(fileWritter);
	         bw.write(data);
	         bw.close();
	         System.out.println("Done");
	      } catch(IOException e){
	         e.printStackTrace();
	      }

		

		
		

	}

}
