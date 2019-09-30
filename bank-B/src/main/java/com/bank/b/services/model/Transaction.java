package com.bank.b.services.model;

import java.util.Date;

public class Transaction {

	public Transaction(TransactionType type, Date transactionDate, long amount, String id, Long accID, Long bankID) {
		super();
		this.type = type;
		this.transactionDate = transactionDate;
		this.amount = amount;
		this.id = id;
		this.accID = accID;
		this.bankID = bankID;
	}
	
	public TransactionType getType() {
		return type;
	}
	public void setType(TransactionType type) {
		this.type = type;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Long getAccID() {
		return accID;
	}
	public void setAccID(Long accID) {
		this.accID = accID;
	}
	public Long getBankID() {
		return bankID;
	}
	public void setBankID(Long bankID) {
		this.bankID = bankID;
	}
	private TransactionType type;
	private Date transactionDate;
	private long amount;
	private String id;
	private Long accID;
	private Long bankID;
}
