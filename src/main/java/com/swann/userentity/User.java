package com.swann.userentity;

import javax.persistence.*;

import com.sun.xml.bind.v2.model.core.ID;

import java.util.ArrayList;
import java.util.List;

@Entity
public class User extends UserEntity<ID> {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "user", length = 100, nullable = false, unique = true)
	private String name;

	@Column(name = "password", length = 100, nullable = false)
	private String password;

	@OneToMany(mappedBy = "user")
	private List<UserPost> posts = new ArrayList<>();

	@OneToOne
	public UserDetials detials;

	public User() {

	}

	public User(String name, String password) {
		this.name = name;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<UserPost> getPosts() {
		return posts;
	}

	public void setPosts(List<UserPost> posts) {
		this.posts = posts;
	}

	public UserDetials getDetials() {
		return detials;
	}

	public void setDetials(UserDetials detials) {
		this.detials = detials;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
}
