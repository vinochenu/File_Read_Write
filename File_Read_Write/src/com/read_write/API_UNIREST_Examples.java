package com.read_write;

import io.joshworks.restclient.http.HttpResponse;
import io.joshworks.restclient.http.Json;
import io.joshworks.restclient.http.Unirest;

public class API_UNIREST_Examples {

	public void getRequest() {
		HttpResponse<Json> getrequest=Unirest.get("http://dummy.restapiexample.com/api/v1/employees").asJson();

		System.out.println("Status code is "+getrequest.getStatus());
		System.out.println("Status message is "+getrequest.getStatusText());
		System.out.println("Status body is "+getrequest.body());

	}

	public void postRequest() {

		HttpResponse<Json> postrequest=Unirest.post("http://dummy.restapiexample.com/api/v1/create").body("{\"name\":\"vishnu\",\"salary\":\"123456789\",\"age\":\"29\"}").asJson();

		System.out.println("Status code is "+postrequest.getStatus());
		System.out.println("Status message is "+postrequest.getStatusText());
		System.out.println("Status body is "+postrequest.body());


	}

	public void putRequest() {
		HttpResponse<Json> putrequest=Unirest.put("http://dummy.restapiexample.com/api/v1/update/66").body("{\"name\":\"vinoth\",\"salary\":\"123456789\",\"age\":\"29\"}").asJson();

		System.out.println("Status code is "+putrequest.getStatus());
		System.out.println("Status message is "+putrequest.getStatusText());
		System.out.println("Status body is "+putrequest.body());

	}

	public void deleteRequest() {
		
		HttpResponse<Json> deleterequest=Unirest.delete("http://dummy.restapiexample.com/api/v1/delete/2").asJson();
		

		System.out.println("Status code is "+deleterequest.getStatus());
		System.out.println("Status message is "+deleterequest.getStatusText());
		System.out.println("Status body is "+deleterequest.body());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		API_UNIREST_Examples output=new API_UNIREST_Examples();

		//output.getRequest();
		//output.postRequest();
		//output.putRequest();
		output.deleteRequest();

	}

}
