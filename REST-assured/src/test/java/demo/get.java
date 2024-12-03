package demo;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;
public class get 
{
	@Test
	public void GET() 
	{
		baseURI="https://reqres.in/";
		given().get("api/users/2").
		then().
		statusCode(200).
		body("data.first_name", equalTo("Janet")).
		log().body();
	}
}
