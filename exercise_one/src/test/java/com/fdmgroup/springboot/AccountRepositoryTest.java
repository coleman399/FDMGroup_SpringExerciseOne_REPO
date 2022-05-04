package com.fdmgroup.springboot;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class AccountRepositoryTest {

    @Test
    void testAddAccount() {
        Account account = new Account();
        AccountRepository accountRepository = new AccountRepository();
        accountRepository.addAccount(account);
        Map<Long, Account> result = new HashMap<Long, Account>();
        result.put(account.getAccountNumber(), account);
        assertEquals(result, accountRepository.getAccounts());
    }

    @Test
    void testGetAccounts() {
        AccountRepository accountRepository = new AccountRepository();
        Map<Long, Account> result = new HashMap<Long, Account>();
        assertEquals(result, accountRepository.getAccounts());
    }

    @Test
    void testRemoveAccount() {
        Account account = new Account();
        AccountRepository accountRepository = new AccountRepository();
        accountRepository.addAccount(account);
        Map<Long, Account> result = new HashMap<Long, Account>();
        accountRepository.removeAccount(account);
        assertEquals(result, accountRepository.getAccounts());
    }

    @Test
    void testSetAccounts() {
        Account account = new Account();
        AccountRepository accountRepository = new AccountRepository();
        Map<Long, Account> result = new HashMap<Long, Account>();
        result.put(account.getAccountNumber(), account);
        accountRepository.setAccounts(result);
        assertEquals(result, accountRepository.getAccounts());
    }

    @Test
    void testToString() {
        AccountRepository accountRepository = new AccountRepository();
        String result = "AccountRepository [accounts=" + accountRepository.getAccounts() + "]";
        assertEquals(result, accountRepository.toString());
    }
}
