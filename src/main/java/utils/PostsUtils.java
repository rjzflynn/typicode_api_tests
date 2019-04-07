package utils;

import java.util.HashMap;
import java.util.Map;

public class PostsUtils {
	
	public static Map<String, String> newPost() {
		Map<String,String> post =  new HashMap<String,String>();
		post.put("title", "foo");
		post.put("body", "bar");
		post.put("userId", "1");
		return post;
	}
	
	public static Map<String, String> updatePost() {
		Map<String,String> post =  new HashMap<String,String>();
		post.put("id", "1");
		post.put("title", "foo");
		post.put("body", "updated content");
		post.put("userId", "1");
		return post;
	}

	/**
	 * @return the id of a Post which is not on the server
	 */
	public static String notFoundPost() {
		return "209";
	}
	

}
