package com.fdmgroup.springboot;

import java.math.BigDecimal;

public class Account {
    private BigDecimal balance;
    private Long accountNumber;

    public Account() {
        this.balance = new BigDecimal(0);
        this.accountNumber = 1111L;
    }

    public Account(BigDecimal balance, Long accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public void setAccountNumber(Long result) {
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public Object getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account [accountNumber=" + accountNumber + ", balance=" + balance + "]";
    }

}
