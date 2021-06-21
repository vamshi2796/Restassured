package tests;

import static io.restassured.RestAssured.given;
//import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

import org.testng.annotations.Test;

import io.restassured.matcher.RestAssuredMatchers;

public class Xmlschemavalidation {
	@Test
	public void localapiget() {
		given().
		//header("Content-Type","application/json").
		get("https://reqres.in/api/users?page=2").
		then().
		assertThat().body(RestAssuredMatchers.matchesXsdInClasspath("schema.json")).log().all();
		
	}

}
