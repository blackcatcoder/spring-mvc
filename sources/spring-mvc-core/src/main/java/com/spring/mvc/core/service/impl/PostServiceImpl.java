package com.spring.mvc.core.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.mvc.core.entities.Post;
import com.spring.mvc.core.service.PostService;

@Service
public class PostServiceImpl implements PostService{

	@Override
	public List<Post> getAllPost() {
		Post p1 = new Post();
		p1.setId("p1");
		
		Post p2 = new Post();
		p2.setId("p2");
		
		Post p3 = new Post();
		p3.setId("p3");
		
		return Arrays.asList(p1, p2, p3);
	}

}
