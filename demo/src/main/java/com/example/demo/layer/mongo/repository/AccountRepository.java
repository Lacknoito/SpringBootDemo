package com.example.demo.layer.mongo.repository;

import com.example.demo.layer.mongo.entity.Account;

public interface AccountRepository {
	public Account getAccountByNo(String accountNo);
}
