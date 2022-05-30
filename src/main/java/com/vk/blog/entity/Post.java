package com.vk.blog.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "post",uniqueConstraints = {@UniqueConstraint(columnNames = {"title"})})
public class Post {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "id")
		private Long id;
		
		@Column(name = "title", nullable = false)
		private String title;
		
		@Column(name = "description", nullable = false)
		private String description;
		
		@Column(name = "content", nullable = false)
		private String content;
		
}
