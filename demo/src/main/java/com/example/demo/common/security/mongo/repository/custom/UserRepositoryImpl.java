package com.example.demo.common.security.mongo.repository.custom;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.common.security.model.LoginRequest;
import com.example.demo.common.security.mongo.entity.User;
import com.example.demo.common.security.mongo.repository.UserRepository;

@Repository
public class UserRepositoryImpl implements UserRepository {
	Logger logger = LoggerFactory.getLogger(UserRepositoryImpl.class);
	
	@Autowired
    private MongoTemplate mongoTemplate;
	
    public User getUser(LoginRequest loginRequest) {
        Query query = new Query();
        query.addCriteria(Criteria.where("username").is(loginRequest.getUsername()));
        query.addCriteria(Criteria.where("password").is(loginRequest.getPassword()));
        List<User> list = mongoTemplate.find(query,User.class,"user");
        if(list.size() > 0){
            return list.get(0);
        }else{
            return null;
        }
    }
}
