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

public class localAPI 
{
	@Test
	public void get() 
	{
		baseURI="http://localhost:3000";
		given().
		when().get("/Users").
		then().
			statusCode(200).
			log().body();
	}
}