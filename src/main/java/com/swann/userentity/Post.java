package com.swann.userentity;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.sun.xml.bind.v2.model.core.ID;

import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
public class Post extends UserEntity<ID> {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "title", length = 100, nullable = false)
	private String title;

	@Column(name = "post", length = 255)
	@Type(type = "text")
	private String post;

	@ManyToOne
	private User user;

	public Post() {

	}

	public Post(User user, String title, String post) {
		this.user = user;
		this.title = title;
		this.post = post;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	@Override
	public String toString() {
		return "UserPost{" + "user=" + user + ", title='" + title + '\'' + ", post='" + post + '\'' + '}';
	}

	@Override
	public Long getId() {
		return id;
	}
}
