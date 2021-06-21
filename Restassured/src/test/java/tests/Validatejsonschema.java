package tests;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;;


public class Validatejsonschema {
	@Test
	public void localapiget() {
		given().
		//header("Content-Type","application/json").
		get("https://reqres.in/api/users?page=2").
		then().
		assertThat().body(matchesJsonSchemaInClasspath("schema.json")).log().all();
		
	}


}
