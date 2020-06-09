package com.swann.repository;

import org.springframework.data.repository.CrudRepository;

import com.swann.userentity.UserDetials;

public interface UserDRepository extends CrudRepository<UserDetials, Long> {

}
