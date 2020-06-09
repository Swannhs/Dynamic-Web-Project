package com.swann.repository;

import org.springframework.data.repository.CrudRepository;

import com.swann.userentity.UserPost;

public interface UserPRepository extends CrudRepository<UserPost, Long> {

}
