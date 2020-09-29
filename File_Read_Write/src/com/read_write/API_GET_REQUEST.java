package com.read_write;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class API_GET_REQUEST {
	
	public void api_GETREQUEST() throws Exception {
		URL url=new URL("http://dummy.restapiexample.com/api/v1/employees");
		HttpURLConnection connection=(HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		connection.connect();
		
		int statuscode=connection.getResponseCode();
		System.out.println("status code is "+statuscode);
		
		String message=connection.getResponseMessage();
		System.out.println("Response message is "+message);
		
		InputStream inputstream=connection.getInputStream();
		InputStreamReader inputstreamreader=new InputStreamReader(inputstream);
		BufferedReader bufferreader=new BufferedReader(inputstreamreader);
		
		String line;
		StringBuffer buffer=new StringBuffer();
		
		while ((line=bufferreader.readLine())!=null) {
			
			buffer.append(line);
			//System.out.println(buffer);	
		}
		System.out.println(buffer);
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		API_GET_REQUEST driver=new API_GET_REQUEST();
		driver.api_GETREQUEST();

	}

}
