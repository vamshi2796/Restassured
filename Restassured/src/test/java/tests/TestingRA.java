package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class TestingRA {

@Test
public void learning()
{
	Response response =get("https://reqres.in/api/users?page=2");
	System.out.println(response.getStatusCode());
	System.out.println(response.getTime());
	System.out.println(response.getBody().asString());
	System.out.println(response.getHeader("content-type"));
	
	int sc=response.getStatusCode();
	System.out.println(sc);
	Assert.assertEquals(sc, 200);

}
@Test
public void restbdd() {
	baseURI= "https://reqres.in/api/";
	given().
	get("users?page=2").
	then().
	statusCode(200).body("data[1].id",equalTo(8)).log().all();
}
@Test
public void pr() {
	given().log().all().
	get("https://reqres.in/api/users?page=2").
	then().
	statusCode(200).
	and().
	body("support.url", equalTo("https://reqres.in/#support-heading"));
}
}
