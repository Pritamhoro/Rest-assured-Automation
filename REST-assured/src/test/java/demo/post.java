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
public class post 
{
	
	@Test
	public void post_req() 
	{
		Map<String,Object> map=new HashMap<String,Object>();
		
		JSONObject request =new JSONObject();
		
		request.put("email", "eve.holt@reqres.in");
		request.put("password", "cityslicka");
		
		System.out.println(request.toJSONString());
		
		baseURI="https://reqres.in/";
		
		given().
	    body(request.toJSONString()).
	    header("content-Type","application/json").
	when().
	    post("/api/login").
	then().
	    statusCode(200).
	    log().body();

	}
}
