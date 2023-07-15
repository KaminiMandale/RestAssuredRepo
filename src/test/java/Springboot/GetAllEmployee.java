package Springboot;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetAllEmployee {
	
	
	@Test
	public void test1() {
		RestAssured.baseURI = "http://18.234.166.182:8088/employees";
		RequestSpecification request = RestAssured.given();

		Response response = request.get();
	}

}
