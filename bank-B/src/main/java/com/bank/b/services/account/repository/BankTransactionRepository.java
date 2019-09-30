package com.bank.b.services.account.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bank.b.services.model.Transaction;


public class BankTransactionRepository {
	
	Map<Long,List<Transaction>> transactions = new HashMap<>();
	
	
	public Transaction add(Long custID , Transaction transaction) {
		
		if(transactions.get(custID) == null ) {
			transactions.put(custID, new ArrayList<>());
			
		}
		
		transactions.get(custID).add(transaction);
		return transaction;
	}
	
	public List<Transaction> list(Long custID) {
		
		return transactions.get(custID);
	}

}
