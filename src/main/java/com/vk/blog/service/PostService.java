package com.vk.blog.service;

import java.util.List;

import com.vk.blog.dto.PostDTO;

public interface PostService {

	public PostDTO createPost(PostDTO postDTO);
	
	public List<PostDTO> getAllPost();
}
