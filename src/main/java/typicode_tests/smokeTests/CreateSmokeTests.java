package typicode_tests.smokeTests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

import java.util.Map;

import org.junit.Test;

import utils.CommentUtils;
import utils.PostsUtils;
import utils.URIUtils;

public class CreateSmokeTests {
	
		//could create post, and then comment to that post? order of test dependencies
	
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
		
		@Test
		public void createCommentTest() {
			Map<String,String> comment = CommentUtils.newComment();
			given().
				baseUri(URIUtils.getBaseUri()).
				contentType("application/json").
				body(comment).
			when().
				post("/comments").
				then().
				assertThat().
				statusCode(201).
			and().
				body(containsString(comment.get("body")));		
		}
		
		//TODO :Create similar create resource test for  albums, todos ect.

}
