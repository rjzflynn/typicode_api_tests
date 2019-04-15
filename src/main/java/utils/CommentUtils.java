package utils;

import java.util.HashMap;
import java.util.Map;

public class CommentUtils {

	public static Map<String, String> newComment() {
		Map<String,String> comment =  new HashMap<String,String>();
		comment.put("postId", "1");
		comment.put("name", "John Doe");
		comment.put("email", "jd@gmail.com");
		comment.put("body", "foo bar bar foo");
		return comment;
	}

}
