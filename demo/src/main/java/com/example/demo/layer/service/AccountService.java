package com.example.demo.layer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.layer.mongo.entity.Account;
import com.example.demo.layer.mongo.repository.AccountRepository;

@Service
public class AccountService {
	@Autowired
	public AccountRepository accountRepository;
	
	public Account getAccountByNo(String accountNo) {
		return accountRepository.getAccountByNo(accountNo);
	}
}
