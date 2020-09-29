package com.read_write;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSON_Read {
	
	public void readJSON() throws IOException, ParseException {
		
		//create object JSONParser class
		JSONParser jsonParser=new JSONParser();
		
		//file reader to read 
		FileReader fileReader=new FileReader("Sample.json");
		
		//parse the file from json format
		Object parseddata=jsonParser.parse(fileReader);
	
	//since getmethod is in JSONObject, typecast object to JSONObject
	JSONObject jsonObject=(JSONObject) parseddata;
	
	//get the all the key from json file
	String name=(String) jsonObject.get("name");
	System.out.println("Key : Name is "+name);
	long id=(long) jsonObject.get("id");
	System.out.println("Key : id is "+id);
	String company=(String) jsonObject.get("company");
	System.out.println("Key : company is "+company);

	
JSONArray array=(JSONArray) jsonObject.get("Details");

//iterator to print the array 
Iterator iterator=array.iterator();
	
	while(iterator.hasNext())
	{
		System.out.println("Key : Details is "+iterator.next());
	}
	
	}

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub

		JSON_Read json_Read=new JSON_Read();
		json_Read.readJSON();
		
	}

}
