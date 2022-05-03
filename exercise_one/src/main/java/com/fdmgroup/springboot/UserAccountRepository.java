package com.fdmgroup.springboot;

import java.util.HashMap;
import java.util.Map;

public class UserAccountRepository {
    private Map<User, Account> userAccounts;

    public UserAccountRepository() {
        userAccounts = new HashMap<User, Account>();
    }

    public UserAccountRepository(Map<User, Account> userAccounts) {
        this.userAccounts = userAccounts;
    }

    public void addUserAndAccount(User user, Account account) {
        userAccounts.put(user, account);
    }

    public void removeUser(User user) {
        userAccounts.remove(user);
    }

    public void removeAccount(Account account) {
        userAccounts.remove(account.getAccountNumber(), account);
    }

    public Map<User, Account> getUserAccounts() {
        return userAccounts;
    }

    public void setUserAccounts(Map<User, Account> userAccounts) {
        this.userAccounts = userAccounts;
    }

    @Override
    public String toString() {
        return "UserAccountRepository [userAccounts=" + userAccounts + "]";
    }

}
