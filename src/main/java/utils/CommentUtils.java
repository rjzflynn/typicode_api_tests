package utils;

import java.util.HashMap;
import java.util.Map;

public class CommentUtils {
	
	private static final String NEW_COMMENT_POST_ID = "1";
	
	public static String getNewCommentPostId() {
		return NEW_COMMENT_POST_ID;
	}


	public static Map<String, String> newComment() {
		Map<String,String> comment =  new HashMap<String,String>();
		comment.put("postId", NEW_COMMENT_POST_ID);
		comment.put("name", "John Doe");
		comment.put("email", "jd@gmail.com");
		comment.put("body", "foo bar bar foo");
		return comment;
	}
	
	public static Map<String, String> invalidComment() {
		Map<String,String> comment =  new HashMap<String,String>();
		comment.put("title", "only title");
		return comment;
	}
	
	
	public static Map<String, String> newComment(int postId) {
		Map<String,String> comment =  new HashMap<String,String>();
		comment.put("postId", String.valueOf(postId));
		comment.put("name", "John Doe");
		comment.put("email", "jd@gmail.com");
		comment.put("body", "foo bar bar foo");
		return comment;
	}

}
