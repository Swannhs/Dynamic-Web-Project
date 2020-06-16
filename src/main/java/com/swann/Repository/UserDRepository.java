package com.swann.repository;

import com.swann.userentity.UserPost;
import org.springframework.data.repository.CrudRepository;

import com.swann.userentity.UserDetials;

public interface UserDRepository extends CrudRepository<UserDetials, Long> {

    UserDetials findByUser(String name);
}
