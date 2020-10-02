package com.spring.devblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.devblog.model.Post;

public interface DevblogRepository extends JpaRepository<Post, Long>{

}
