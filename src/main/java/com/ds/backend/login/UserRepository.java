package com.ds.backend.login;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Integer>{

	User findByName(String username);

	User findById(int username);

	boolean existsByUsername(String username);

}
