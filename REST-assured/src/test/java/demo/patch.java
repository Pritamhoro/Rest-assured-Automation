package demo;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;


public class patch 
{
	@Test
	public void ptach_req() 
	{
		HashMap<String, Object> map=new HashMap<String, Object>();
		JSONObject request=new JSONObject();
		
		request.put("name","morpheus");
		request.put("job", "zion resident");
		
		baseURI="https://reqres.in/api";
		
		given().
			header("Content-Type","application/json").
			body(request.toJSONString()).
		when().
			patch("/api/users/2").
		then().
			statusCode(200).
		body("job", equalTo("zion resident")).
		log().body();
	
	}
}
