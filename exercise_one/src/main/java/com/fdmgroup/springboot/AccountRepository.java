package com.fdmgroup.springboot;

import java.util.HashMap;
import java.util.Map;

public class AccountRepository {
    private Map<Long, Account> accounts;

    public AccountRepository() {
        accounts = new HashMap<Long, Account>();
    }

    public AccountRepository(Map<Long, Account> accounts) {
        this.accounts = accounts;
    }

    public Map<Long, Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Map<Long, Account> accounts) {
        this.accounts = accounts;
    }

    public void removeAccount(Account account) {
        accounts.remove(account.getAccountNumber());
    }

    public void addAccount(Account account) {
        accounts.put(account.getAccountNumber(), account);
    }

    @Override
    public String toString() {
        return "AccountRepository [accounts=" + accounts + "]";
    }

}
