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

	baseURI="https://reqres.in/api";
		
		given().
			header("Content-Type","application/json").
		when().
			delete("/api/users/2").
		then().
			statusCode(204);

	
	}
}
