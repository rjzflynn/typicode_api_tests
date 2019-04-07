package typicode_tests.postsTests;

import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;
import org.junit.Test;
import utils.PostsUtils;
import utils.URIUtils;

public class PostsTests {
	
	@Test
	 public void fetchSingleNotFound() {
		 given().
		 	baseUri(URIUtils.getBaseUri()).
		 when().
		 	get("/posts/" + PostsUtils.notFoundPost()).
		 then().
	        assertThat().
	        statusCode(404).
	    and().
	        contentType(ContentType.JSON);
	 }
	
	// Failing : API should return 404, not 200
	@Test
	 public void deleteSingleNotFound() {
		 given().
		 	baseUri(URIUtils.getBaseUri()).
		 when().
		 	delete("/posts/" + PostsUtils.notFoundPost()).
		 then().
	        assertThat().
	        statusCode(404).
	    and().
	        contentType(ContentType.JSON);
	 }
	

}
