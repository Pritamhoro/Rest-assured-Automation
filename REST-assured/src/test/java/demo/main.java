package demo;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class main {

	@Test
	public  void Test()
	{
		
		Response response=RestAssured.get("https://reqres.in/api/users?page=2");
		
		System.out.println(response.statusCode());
		System.out.println(response.asPrettyString());

		
	}

}
