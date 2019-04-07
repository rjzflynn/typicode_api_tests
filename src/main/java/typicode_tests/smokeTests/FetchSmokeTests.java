package typicode_tests.smokeTests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;
import io.restassured.http.ContentType;
import org.junit.Test;
import utils.URIUtils;

public class FetchSmokeTests {
	
		
	@Test
	public void fetchListTest() {
		given().
			baseUri(URIUtils.getBaseUri()).
			pathParam("resource", "posts").
			pathParam("resource", "comments").
			pathParam("resource", "albums").
			pathParam("resource", "photos").
			pathParam("resource", "todos").
			pathParam("resource", "users").
		when().
			get("/{resource}")
		.then()
			.assertThat().
			statusCode(200).
		and().
			contentType(ContentType.JSON).
		and()
			.body("size()", greaterThan(5));
	}

	@Test
	public void fetchSingleTest() {
		given().
			baseUri(URIUtils.getBaseUri()).
			pathParam("resource", "posts").
			pathParam("resource", "comments").
			pathParam("resource", "albums").
			pathParam("resource", "photos").
			pathParam("resource", "todos").
			pathParam("resource", "users").
		when().
			get("/{resource}/1")
		.then().
			assertThat().
			statusCode(200).
		and()
			.contentType(ContentType.JSON)
		.and()
			.body("isEmpty()", is(false));
	}
	
	

}
