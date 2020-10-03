package com.spring.devblog.service;

import java.util.List;

import com.spring.devblog.model.Post;

public interface DevblogService {
	
	List<Post> findAll();
	Post findById(long id);
	Post save(Post post);
	

}
