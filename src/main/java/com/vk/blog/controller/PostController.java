package com.vk.blog.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vk.blog.dto.PostDTO;
import com.vk.blog.service.PostService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/posts")
@RequiredArgsConstructor
public class PostController {

	private final PostService postService;
	
	@PostMapping
	public ResponseEntity<PostDTO> createPost(@RequestBody PostDTO postDTO){
		//return new ResponseEntity<PostDTO>(postService.createPost(postDTO),HttpStatus.CREATED);
		return null;
	}

	@GetMapping
	public ResponseEntity<List<PostDTO>> getAllPost(){
		return new ResponseEntity<List<PostDTO>>(postService.getAllPost(), HttpStatus.OK);
	}
}
