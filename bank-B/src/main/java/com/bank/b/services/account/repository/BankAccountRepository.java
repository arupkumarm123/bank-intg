package com.bank.b.services.account.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.bank.b.services.model.Account;


public class BankAccountRepository {

	private List<Account> accounts = new ArrayList<>();
	
	public Account add(Account account) {
	accounts.add(account);
		return account;
	}
	
	public List<Account> findByCustID(Long custID) {
		
		return accounts.stream().filter(account -> account.getCustID() == custID).collect(Collectors.toList());
		
	}
	

	
}
