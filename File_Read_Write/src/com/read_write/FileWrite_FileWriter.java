package com.read_write;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite_FileWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String location="Using_FileWriter.txt";
		String content="File write successfully using FileWriter";
		//this straight forward & performance is low since it is directly working in file(costly operation)
		FileWriter filewriter=new FileWriter(location);
		filewriter.write(content);
		filewriter.close();

	}

}
