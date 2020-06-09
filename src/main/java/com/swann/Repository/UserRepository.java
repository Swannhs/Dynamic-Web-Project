package com.swann.repository;

import org.springframework.data.repository.CrudRepository;

import com.swann.userentity.User;

public interface UserRepository extends CrudRepository <User, Long>{

	User findByName(String parameter);
}
