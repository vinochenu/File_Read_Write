package com.read_write;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class API_PUT_REQUEST {
	
	public void putRequest() throws Exception {
		URL url =new URL("http://dummy.restapiexample.com/api/v1/update/1");
		
		HttpURLConnection connection=(HttpURLConnection) url.openConnection();
		connection.setRequestMethod("PUT");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);
		
		String jsonupdate="{\"name\":\"Tiger Nixon_1\",\"salary\":\"12345\",\"age\":\"62\"}";
		
		byte[] updateinput=jsonupdate.getBytes();
		
		OutputStream outputstream=connection.getOutputStream();
		
		outputstream.write(updateinput);
		
		System.out.println("Status code is"+connection.getResponseCode());
		System.out.println("Response message is "+connection.getResponseMessage());
		
		
		InputStream inputstream=connection.getInputStream();
		InputStreamReader inputStreamReader=new InputStreamReader(inputstream);
		BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
		
		StringBuffer buffer=new StringBuffer();
		
		String line;
		
		while((line=bufferedReader.readLine())!=null) {
			buffer.append(line);
			
		};
		
		System.out.println("updated output is"+buffer);
		
		
		
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		API_PUT_REQUEST put=new API_PUT_REQUEST();
		put.putRequest();

	}

}
