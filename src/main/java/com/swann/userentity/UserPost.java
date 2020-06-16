package com.swann.userentity;

import com.sun.xml.bind.v2.model.core.ID;
import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@ToString
public @Data class UserPost extends UserEntity<ID> {
	@Id
	@Column(name = "title", length = 100, nullable = false)
	private String title;

	@Column(name = "post", length = 255)
	@Type(type = "text")
	private String post;

	@ManyToOne
	private User user;


	public UserPost(User user, String title, String post) {
		this.user = user;
		this.title = title;
		this.post = post;
	}

	@Override
	public Long getId() {
		return null;
	}
}
