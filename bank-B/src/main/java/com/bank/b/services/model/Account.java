package com.bank.b.services.model;

public class Account {

	public Account(Long custID, String bankID, String branchID, String acctNumber, AccountType acctType,
			String acctKey) {
		super();
		this.custID = custID;
		this.bankID = bankID;
		this.branchID = branchID;
		this.acctNumber = acctNumber;
		this.acctType = acctType;
		this.acctKey = acctKey;
	}
	public Long getCustID() {
		return custID;
	}
	public void setCustID(Long custID) {
		this.custID = custID;
	}
	public String getBankID() {
		return bankID;
	}
	public void setBankID(String bankID) {
		this.bankID = bankID;
	}
	public String getBranchID() {
		return branchID;
	}
	public void setBranchID(String branchID) {
		this.branchID = branchID;
	}
	public String getAcctNumber() {
		return acctNumber;
	}
	public void setAcctNumber(String acctNumber) {
		this.acctNumber = acctNumber;
	}
	public AccountType getAcctType() {
		return acctType;
	}
	public void setAcctType(AccountType acctType) {
		this.acctType = acctType;
	}
	public String getAcctKey() {
		return acctKey;
	}
	public void setAcctKey(String acctKey) {
		this.acctKey = acctKey;
	}
	private Long custID;
	private String bankID;
	private String branchID;
	private String acctNumber;
	private AccountType acctType;
	private String acctKey;

}