package com.read_write;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriter_FileOutputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String location="Using_FileOutputStream.txt";
		String content="File write successfully using FileOutputStream";
		
		FileOutputStream fos=new FileOutputStream(location);
		// here we can store the raw byte (ex: image)
		byte[] rawbyte=content.getBytes();
		
		fos.write(rawbyte);
		
		fos.close();

	}

}
