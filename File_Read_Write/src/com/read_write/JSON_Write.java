package com.read_write;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSON_Write {

	public void writeJSON() throws IOException {
		
		//Create object to JSONOBJECT class
		JSONObject jsonObject=new JSONObject();
		
		//add key & value pair into created object
		jsonObject.put("name", "vino");
		jsonObject.put("id", 101);
		jsonObject.put("company", "FIS");
		
		//create JSONARRAY to add array values 
		JSONArray array=new JSONArray();
		array.add("Having 8 years of experience");
		array.add("Having knowledge in Selenium");
		array.add("Critical resource");
		
		//add created array  into created object
		jsonObject.put("Details", array);
		
		
		//for write operation
		FileWriter fileWriter=new FileWriter("Sample.json");
		fileWriter.write(jsonObject.toJSONString());
		
		fileWriter.close();
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		JSON_Write json_Write=new JSON_Write();
		json_Write.writeJSON();

		
	}

}
