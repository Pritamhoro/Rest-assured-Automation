package demo;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.nio.channels.AcceptPendingException;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class localAPI 
{
	@Test(priority = 2)
	public void get() 
	{
		baseURI="http://localhost:3000";
		given().
		when().get("/Users").
		then().
			statusCode(200).
			log().body();
	}
	
	
	// Update with the new user 
	
	@Test(priority = 2)
	public void post() 
	{
		JSONObject request=new JSONObject();
		
		request.put("FirstName", "JhON");
		request.put("LasttName", "Cena");
		request.put("SubjectID", 7);
		
		
		
		baseURI="http://localhost:3000";
		given().contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(request.toJSONString()).
		when().post("/Users").
		then().
			statusCode(201).
			log().body();
	}
	@Test
	public void get1() 
	{
		baseURI="http://localhost:3000";
		given().
		when().get("/Users").
		then().
			statusCode(200).
			log().body();
	}
	
	@Test
	public void Delete() 
	{
		baseURI="http://localhost:3000";
		given().
		delete("/Users/91b7").then().statusCode(200);
	}
}
