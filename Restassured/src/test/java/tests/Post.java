package tests;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class Post {
//	@Test
//	public void req() {
//		given().
//		get("https://reqres.in/api/users?page=2").
//		then().
//		statusCode(200).
//		and().body("data[1].first_name", equalTo("Lindsay")).
//		and().body("data.first_name", hasItems("Lindsay","Michael"))
//		.log().all();
//		
	//}
	
//	@Test
//	public void testpost() {
//	Map<String,Object> map=new HashMap<String,Object>();
//	JSONObject request= new JSONObject();
//	request.put("name", "Raghav1");
//	//request.put("name", "Raghav");
//	request.put("job", "leader1");
//	System.out.println(map);
//	
//	given().
//	header("Content-Type","application/json").
//	contentType(ContentType.JSON).
//	accept(ContentType.JSON).
//	body(request.toJSONString()).
//	when().
//	post("https://reqres.in/api/users").
//	then().
//	statusCode(201).log().all();
//	}

		
	@Test
	public void testput() {
		JSONObject req=new JSONObject();
		req.put("school", "Raghav1");
		req.put("college", "leader1");	
		given().
		header("Content-Type", "application/json").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		when().
		put("https://reqres.in/api/users/2").
		then().
		statusCode(200)
		.log().all();
	}
		
		
		
		
		

}
	
	


