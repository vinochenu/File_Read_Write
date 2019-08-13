package com.read_write;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWrite_path {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String location="Using_Path.txt";
		String content="file write successfully using Path";
		//it also writes byte array (ex: image) raw byte
		Path path=Paths.get(location);
		
		Files.write(path,content.getBytes());
		
		

	}

}
