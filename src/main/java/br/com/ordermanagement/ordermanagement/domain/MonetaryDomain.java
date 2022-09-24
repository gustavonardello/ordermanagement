package br.com.ordermanagement.ordermanagement.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;

@Entity
public class MonetaryDomain 
{
    public BigDecimal value;
    public BigDecimal cashback;
    public BigDecimal balance;
    
	public BigDecimal getValue() {
		return value;
	}
	public void setValue(BigDecimal value) {
		this.value = value;
	}
	public BigDecimal getCashback() {
		return cashback;
	}
	public void setCashback(BigDecimal cashback) {
		this.cashback = cashback;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
}
