package com.read_write;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class API_POST_REQUEST {
	
	public void postREQUEST() throws Exception {
		URL url=new URL("http://dummy.restapiexample.com/api/v1/create");
		HttpURLConnection connection=(HttpURLConnection) url.openConnection();
		
		connection.setRequestMethod("POST");
		connection.setRequestProperty("Content-Type", "application/json");// this is required in POST request since we need to give body content 
		connection.setDoOutput(true);// this is default false in "GET" REQUEST
		
		String jsonbody="{\"name\":\"vinochenu\",\"salary\":\"123456789\",\"age\":\"29\"}";
		byte [] body=jsonbody.getBytes();
		
		OutputStream outputstream=connection.getOutputStream();
		outputstream.write(body);
		
		System.out.println("Status code is"+connection.getResponseCode());//to display status code
		System.out.println("Response message is "+connection.getResponseMessage());//to display response msg
		
		//to display body created
		InputStream inputstream=connection.getInputStream();
		
		InputStreamReader inputstreamreader=new InputStreamReader(inputstream);
		
		BufferedReader bufferreader=new BufferedReader(inputstreamreader);
		
		StringBuffer data=new StringBuffer();
		String line;
		
		while((line=bufferreader.readLine())!=null){
			data.append(line);
			
		}
		
		System.out.println("created input is "+data);
		
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		API_POST_REQUEST post=new API_POST_REQUEST();
		post.postREQUEST();

	}

}
