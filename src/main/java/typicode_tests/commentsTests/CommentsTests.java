package typicode_tests.commentsTests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

import java.util.Map;

import org.junit.Test;

import utils.CommentUtils;
import utils.URIUtils;

public class CommentsTests {
	
	// failing should not return 201 status
	@Test
	public void createInvalidCommentTest() {
		Map<String,String> comment = CommentUtils.invalidComment();
		given().
			baseUri(URIUtils.getBaseUri()).
			contentType("application/json").
			body(comment).
		when().
			post("/comments").
		then().
			assertThat().
			statusCode(400);	
	}
	
}
