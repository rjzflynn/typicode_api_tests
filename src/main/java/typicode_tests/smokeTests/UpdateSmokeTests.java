package typicode_tests.smokeTests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

import java.util.Map;

import org.junit.Test;

import utils.PostsUtils;
import utils.URIUtils;

public class UpdateSmokeTests {
	
	@Test
	public void updatePostTest() {
		Map<String,String> postUpdateBody = PostsUtils.updatePost();
		given().
			baseUri(URIUtils.getBaseUri()).
			contentType("application/json").
			body(postUpdateBody).
		when().
			put("/posts/1").
			then().
			assertThat().
			statusCode(200).
		and().
			body(containsString(postUpdateBody.get("body")));		
	}
	
	//TODO :Create similar update resource test for comments, albums, todos ect.


}
