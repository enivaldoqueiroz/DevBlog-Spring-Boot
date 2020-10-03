package com.spring.devblog.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.devblog.model.Post;
import com.spring.devblog.repository.DevblogRepository;
import com.spring.devblog.service.DevblogService;


@Service
public class DevblogServiceImpl implements DevblogService{
	
	@Autowired
	DevblogRepository devblogRepository;

	@Override
	public List<Post> findAll() {
		return devblogRepository.findAll();
	}

	@Override
	public Post findById(long id) {
		return devblogRepository.findById(id).get();
	}

	@Override
	public Post save(Post post) {
		return devblogRepository.save(post);
	}

}
