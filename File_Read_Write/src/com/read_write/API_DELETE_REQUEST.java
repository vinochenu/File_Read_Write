package com.read_write;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class API_DELETE_REQUEST {
	
public void deleteRequest() throws Exception {
	
	URL url=new URL("http://dummy.restapiexample.com/api/v1/delete/39");
	
	HttpURLConnection connection=(HttpURLConnection) url.openConnection();
	connection.setRequestMethod("DELETE");
	connection.setRequestProperty("Content-Type", "application/json");
	connection.setDoOutput(true);
	
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
		
		API_DELETE_REQUEST delete=new API_DELETE_REQUEST();
		
		delete.deleteRequest();
	}

}
