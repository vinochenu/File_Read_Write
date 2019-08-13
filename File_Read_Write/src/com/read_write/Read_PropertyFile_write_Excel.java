package com.read_write;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Read_PropertyFile_write_Excel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//read the properties file
		FileInputStream fis=new FileInputStream("config.properties");
		Properties properties=new Properties();
		properties.load(fis);
		
		String browser=properties.getProperty("Browser");
		String location=properties.getProperty("DriverLocation");
		System.out.println(browser);
		System.out.println(location);
		
		
		//write in excel file
		String writelocation="config.xls";
		
		FileWriter filewriter=new FileWriter(writelocation);
		BufferedWriter bufferedwriter=new BufferedWriter(filewriter);
		bufferedwriter.write(browser);
		bufferedwriter.write(location);
		bufferedwriter.close();
		
		
		

		
	}

}
