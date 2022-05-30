package com.vk.blog.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.vk.blog.dto.PostDTO;
import com.vk.blog.entity.Post;
import com.vk.blog.service.PostService;

import lombok.RequiredArgsConstructor;

import com.vk.blog.repository.PostRepository;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService{
	
	private final PostRepository postRepository;

	@Override
	public PostDTO createPost(PostDTO postDTO) {
		Post post =  new Post();
		BeanUtils.copyProperties(postDTO, post);
		Post newPost = postRepository.save(post);
		PostDTO newPostDTO = new PostDTO();
		BeanUtils.copyProperties(newPost, newPostDTO);
		return newPostDTO;
	}

	@Override
	public List<PostDTO> getAllPost() {
		List<Post> posts = postRepository.findAll();
		List<PostDTO> postDTOs = new ArrayList<PostDTO>();
		for(Post post : posts) {
			PostDTO newPostDTO = new PostDTO();
			BeanUtils.copyProperties(post, newPostDTO);
			postDTOs.add(newPostDTO);
		}
		return postDTOs;
	}

}
