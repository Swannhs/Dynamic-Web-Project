package com.swann.userentity;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.sun.xml.bind.v2.model.core.ID;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@ToString
@NoArgsConstructor
public @Data
class Post extends UserEntity<ID> {
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


	public Post(User user, String title, String post) {
		this.user = user;
		this.title = title;
		this.post = post;
	}


}
