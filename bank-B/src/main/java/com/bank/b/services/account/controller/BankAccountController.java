package com.bank.b.services.account.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.bank.b.services.account.repository.BankAccountRepository;
import com.bank.b.services.account.repository.BankTransactionRepository;
import com.bank.b.services.model.Account;
import com.bank.b.services.model.Transaction;

@RestController
public class BankAccountController {

	private static final Logger LOGGER = LoggerFactory.getLogger(BankAccountController.class);
	
	@Autowired
	BankAccountRepository repository;
	
	@Autowired
	BankTransactionRepository  transactionRepository;

	
	@PostMapping("/account")
	public Account add(@RequestBody Account account) {
		LOGGER.info("Account add: {}", account);
		return repository.add(account);
	}

	
	@GetMapping("/account/{custid}")
	public List<Account> findById(@PathVariable("custid") Long custID) {
		LOGGER.info("Account find: id={}", custID);
		return repository.findByCustID(custID);
	}
	
	@GetMapping("/transaction/{custid}")
	public List<Transaction> findByCustID(@PathVariable("custid") Long custID) {
		
		return transactionRepository.list(custID);
	}
	
	@PostMapping("/transaction/{custid}")
	public Transaction addTransaction(@PathVariable("custid") Long custID , @RequestBody Transaction transaction) {
		
		LOGGER.info("added transaction for {}" , transaction);
		transactionRepository.add(custID, transaction);
		return transaction;
		
	}
	
}
