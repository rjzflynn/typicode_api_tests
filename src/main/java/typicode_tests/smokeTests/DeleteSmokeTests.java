package typicode_tests.smokeTests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;
import org.junit.Test;
import utils.URIUtils;

public class DeleteSmokeTests {
	
	// the API mocks a delete : in real scenario we would create a new resource, then delete it
	
	@Test
	public void deletePostTest() {
		given()
			.baseUri(URIUtils.getBaseUri())
			.contentType("application/json").
		when().
			delete("/posts/1")
		.then().
			assertThat().
			statusCode(200).
		and().
			body("isEmpty()", is(true));
	}
	
	//TODO :Create similar delete resource test for comments, albums, todos ect.

}
