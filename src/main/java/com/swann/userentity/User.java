package com.swann.userentity;

import javax.persistence.*;

import com.sun.xml.bind.v2.model.core.ID;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@ToString
public @Data
class User extends UserEntity<ID> {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Getter
	private Long id;

	@Column(name = "user", length = 100, nullable = false, unique = true)
	private String name;

	@Column(name = "password", length = 100, nullable = false)
	private String password;

	@OneToMany(mappedBy = "user")
	private List<UserPost> posts = new ArrayList<>();

	@OneToOne
	public UserDetials detials;

	public User(String name, String password) {
		this.name = name;
		this.password = password;
	}


}
