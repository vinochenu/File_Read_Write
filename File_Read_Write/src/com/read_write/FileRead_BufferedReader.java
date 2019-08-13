package com.read_write;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead_BufferedReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String location="Using_BufferedWriter.txt";
		
		FileReader filereader=new FileReader(location);
		
		BufferedReader reader=new BufferedReader(filereader);
		
		
		//if it contains 1 line
		/*String currentline=reader.readLine();
		System.out.println(currentline);*/
		
		
		
		//if it contains more than 1 line
		String currentline;
		while((currentline=reader.readLine())!=null) {
			System.out.println(currentline);
		}
		
		
		
		

	}

}
