package typicode_tests.scenariosTests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import io.restassured.http.ContentType;

import java.util.Map;

import org.junit.Test;

import utils.CommentUtils;
import utils.PostsUtils;
import utils.URIUtils;

public class ScenariosTests {
	
	// test create new Post, then create comment on that post, then fetch post, assert on the post

	@Test
	public void createNewPost_addCommentsToPost_fetchPost_assertOnTheCommentAndPost_test() {
		
		int postId =
		given().
			baseUri(URIUtils.getBaseUri()).
			contentType("application/json").
			body(PostsUtils.newPost()).
		when().
			post("/posts").
		then().
			assertThat().
			statusCode(201).
		extract().
	        path("id");
		
		
		Map<String,String> comment = CommentUtils.newComment(postId);
		int commentId =
				
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
			body(containsString(comment.get("body"))).
		and().
			body("postId", equalTo(String.valueOf(postId))).   //TODO: check returned types, String / int
		extract().
	        path("id");
		
		
		//currenly wont work as the post is mocked and not really  created ...
		given().
	 		baseUri(URIUtils.getBaseUri()).
		when().
		 	get("/comments/" + String.valueOf(commentId)).
		then().
	        assertThat().
	        statusCode(200).
	    and().
	    	body("id", equalTo(String.valueOf(commentId))).
	    and().
	    	body("postId", equalTo(String.valueOf(postId)));
		
		//TODO: more assertations on comment content ect.
		
	}
}
