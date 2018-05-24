package com.ds.backend.login;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, UUID>{

	User findByName(String username);

	

	boolean existsByUsername(String username);

	User findById(String id);



	User findByUsername(String string);

}
