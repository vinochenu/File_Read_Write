package com.read_write;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite_BufferedWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String location="Using_BufferedWriter.txt";
		String content="File Write successfully using Buffered Writer";
		
		FileWriter filewriter=new FileWriter(location);
		
		//here we are not directly using filewriter, so performance will be good & this used widely
		BufferedWriter bufferedwriter=new BufferedWriter(filewriter);
		
		bufferedwriter.write(content);
		bufferedwriter.close();
	}

}
