package com.spring.devblog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.devblog.model.Post;
import com.spring.devblog.service.DevblogService;

@Controller
public class DevblogController {
	
	@Autowired
	DevblogService devblogService;
	
	@RequestMapping(value="/posts", method= RequestMethod.GET)
	public ModelAndView getPosts() {
		ModelAndView mv = new ModelAndView("posts");
		List<Post> posts = devblogService.findAll();
		mv.addObject("posts", posts);
		return mv;
	}

	@RequestMapping(value="/posts/{id}", method= RequestMethod.GET)
	public ModelAndView getPostDetails(@PathVariable("id") long id) {
		ModelAndView mv = new ModelAndView("postDetails");
		Post post = devblogService.findById(id);
		mv.addObject("post", post);
		return mv;
	}

}
