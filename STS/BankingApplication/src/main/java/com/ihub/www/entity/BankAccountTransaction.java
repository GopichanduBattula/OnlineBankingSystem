package com.ihub.www.entity;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;



@Entity
 
public class BankAccountTransaction {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String type;
	
	private String transactionId;
	
	private BigDecimal amount;
	
	private BankAccount destinationBankAccount;
	
	private String transactionTime;
	
	private String narration;
	
	//many to on  mapping with BankAccount
	@ManyToOne
	private BankAccount bankAccount;
	@ManyToOne
	private BankAccount destination;
	@ManyToOne
	private Bank bank;
	@OneToOne
	private User user;
	
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public BankAccount getDestinationBankAccount() {
		return destinationBankAccount;
	}
	public void setDestinationBankAccount(BankAccount destinationBankAccount) {
		this.destinationBankAccount = destinationBankAccount;
	}
	public String getTransactionTime() {
		return transactionTime;
	}
	public void setTransactionTime(String transactionTime) {
		this.transactionTime = transactionTime;
	}
	public String getNarration() {
		return narration;
	}
	public void setNarration(String narration) {
		this.narration = narration;
	}
	public BankAccount getBankAccount() {
		return bankAccount;
	}
	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}
//	public BankAccount getDestination() {
//		return destination;
//	}
//	public void setDestination(BankAccount destination) {
//		this.destination = destination;
//	}
}
	


	



