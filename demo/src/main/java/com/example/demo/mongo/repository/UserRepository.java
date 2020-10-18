package com.example.demo.mongo.repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.mongo.entity.User;

public interface UserRepository extends MongoRepository<User, String>{

}
