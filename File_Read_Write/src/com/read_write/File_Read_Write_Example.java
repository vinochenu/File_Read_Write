package com.read_write;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_Read_Write_Example {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String location="Using_BufferedWrite_1.txt";
		String content="hi "
				+ "Hello "
				+ "how r u";
		
		FileWriter filewriter=new FileWriter(location);
		
		BufferedWriter writer=new BufferedWriter(filewriter);
		
		writer.write(content);
		writer.close();
		
		FileReader filereader=new FileReader(location);
		
		BufferedReader reader=new BufferedReader(filereader);
		
		String line=reader.readLine();
		System.out.println(line);
		
	}
}
