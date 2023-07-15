package restAPI;

import java.util.List;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetRequestWithMap {

	public void test1() {

		RestAssured.baseURI = "http://localhost:3000/employees";

		RequestSpecification request = RestAssured.given();

		Response response = request.get();

		String Body = response.getBody().asString();

		System.out.println("Response body is " + Body);

		System.out.println("Response code is " + response.statusCode());

	}

	// print the all employee name//
	

}
