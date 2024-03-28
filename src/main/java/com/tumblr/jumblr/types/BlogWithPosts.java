package com.tumblr.jumblr.types;

import java.util.List;

public class BlogWithPosts {
	public final Blog blog;
	public final List<Post> posts;

	public BlogWithPosts(Blog blog, List<Post> posts) {
		this.blog = blog;
		this.posts = posts;
	}
}
