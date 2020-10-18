package com.example.demo.layer.mongo.repository.custom;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.layer.mongo.entity.Account;
import com.example.demo.layer.mongo.repository.AccountRepository;

@Repository
public class AccountRepositoryImpl implements AccountRepository{
	@Autowired
    private MongoTemplate mongoTemplate;
	
	public Account getAccountByNo(String accountNo) {
        Query query = new Query();
        query.addCriteria(Criteria.where("accountNo").is(accountNo));
        List<Account> list = mongoTemplate.find(query,Account.class,"account");
        if(list.size() > 0){
            return list.get(0);
        }else{
            return null;
        }
    }
}
