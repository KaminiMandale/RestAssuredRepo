package Github;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class createRepo {
	

	@Test
	public void test1() throws IOException {

byte[] datafile = Files.readAllBytes(Paths.get("repodata.json"));
		
		RestAssured.baseURI = "https://api.github.com/users/KaminiMandale/repos";
		RequestSpecification request = RestAssured.given();

		Response response = request.auth().oauth2("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")
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(datafile)
				.post();

String body = response.getBody().asString();
System.out.println("Response body is " + body);
System.out.println("Response code is " + response.statusCode());

Assert.assertEquals(response.statusCode(), 201);


}
}
