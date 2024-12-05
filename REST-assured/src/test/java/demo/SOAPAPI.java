package demo;

import static io.restassured.RestAssured.baseURI;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
public class SOAPAPI 
{
	
	@Test
	public void validateSOAPXML() throws IOException 
	{
		
		File file=new File("./SOAPAPI/Soap.xml");
		
		if(file.exists()) 
		{
			System.out.println(">>> Files exits <<<");
		}
		
		FileInputStream fe=new FileInputStream(file);
		String requestbody=IOUtils.toString(fe,"UTF-8");
		
			baseURI="http://www.dneonline.com/";
			
			given().
				contentType("text/xml").
				accept(ContentType.XML).
				body(requestbody).
			when().
				post("/calculator.asmx").
			then().
				statusCode(200).
				log().body();
	}
}
