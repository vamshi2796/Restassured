package tests;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;

import static io.restassured.RestAssured.*;


public class Testsonlocalapi {
//	@Test
//	public void localapiget() {
//		given().
//		//header("Content-Type","application/json").
//		get("http://localhost:3000/users").
//
//		then().statusCode(200).log().all();
//		
//	}
//	@Test
//	public void localapipost() {
//		JSONObject jo=new JSONObject();
//		jo.put("fName", "prab");
//		jo.put("rnid", 1);
//		
//		given().
//		header("Content-Type","application/json").
//		contentType(ContentType.JSON).
//		accept(ContentType.JSON).
//		body(jo.toJSONString()).
//		when().
//		post("http://localhost:3000/users").then().
//		statusCode(201).
//		log().all();
//		
//	}

//	@Test
//	public void localapiput() {
//		JSONObject jo=new JSONObject();
//		jo.put("fName", "rebel");
//		jo.put("rnid", 2);
//		
//		given().
//		header("Content-Type","application/json").
//		contentType(ContentType.JSON).
//		accept(ContentType.JSON).
//		body(jo.toJSONString()).
//		when().
//		put("http://localhost:3000/users/3").then().
//		statusCode(200).
//		log().all();
//		
//	}


//	@Test
//	public void localapipatch() {
//		JSONObject jo=new JSONObject();
//		jo.put("fName", "youngrebel");
//		//jo.put("rnid", 2);
//		
//		given().
//		header("Content-Type","application/json").
//		contentType(ContentType.JSON).
//		accept(ContentType.JSON).
//		body(jo.toJSONString()).
//		when().
//		patch("http://localhost:3000/users/3").then().
//		statusCode(200).
//		log().all();
//		
//	}

	
	@Test
	public void localapidelete() {
//		JSONObject jo=new JSONObject();
//		jo.put("fName", "rebel");
//		jo.put("rnid", 2);
//		
		given().
		header("Content-Type","application/json").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		//body(jo.toJSONString()).
		when().
		delete("http://localhost:3000/users/2").then().
		statusCode(200).
		log().all();
		
	}


}
