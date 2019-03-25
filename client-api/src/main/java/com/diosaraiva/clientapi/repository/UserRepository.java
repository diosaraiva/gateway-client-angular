package com.diosaraiva.clientapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.diosaraiva.clientapi.model.User;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {
}