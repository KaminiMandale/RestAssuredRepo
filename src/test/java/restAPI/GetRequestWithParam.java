package restAPI;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetRequestWithParam {
	@Test
	public void test1() {
		RestAssured.baseURI = "http://localhost:3000/employees";

		RequestSpecification request = RestAssured.given();

		Response response = request.get("/1");

		String Body = response.getBody().asString();

		System.out.println("Response body is " + Body);

		Assert.assertTrue(Body.contains("Pankaj"));
		JsonPath json = response.jsonPath();
		String names = json.get("name");
		Assert.assertEquals(names, "Pankaj");

	}
}
