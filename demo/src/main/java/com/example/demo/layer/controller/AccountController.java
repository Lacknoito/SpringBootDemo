package com.example.demo.layer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.AbstractController;
import com.example.demo.common.security.model.response.ResponsePresent;
import com.example.demo.layer.mongo.entity.Account;
import com.example.demo.layer.service.AccountService;

@RestController
public class AccountController extends AbstractController {
	@Autowired
	private AccountService accountService;
	
	@GetMapping("/accounts")
	public ResponsePresent getAccounts() {
		return responseOK("getAccounts");
	}
	
	@GetMapping("/account/{accountNo}")
	public ResponsePresent getAccount(@PathVariable String accountNo) {
		Account account = accountService.getAccountByNo(accountNo);
		return responseOK(account);
	}
}
 