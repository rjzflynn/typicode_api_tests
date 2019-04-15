package typicode_tests.smokeTests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

import java.util.Map;

import org.junit.Test;

import utils.PostsUtils;
import utils.URIUtils;

public class CreateSmokeTests {
	
		@Test
		public void createPostTest() {
			Map<String,String> post = PostsUtils.newPost();
			given().
				baseUri(URIUtils.getBaseUri()).
				contentType("application/json").
				body(post).
			when().
				post("/posts").
				then().
				assertThat().
				statusCode(201).
			and().
				body(containsString(post.get("body")));		
		}
		
		//TODO :Create similar create resource test for comments, albums, todos ect.

}
