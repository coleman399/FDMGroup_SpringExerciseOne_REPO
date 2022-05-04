package com.fdmgroup.springboot;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class TellerTest {

    @Test
    void testAddAccount() {
        Account account = new Account();
        Teller teller = new Teller();
        Map<Long, Account> result = new HashMap<Long, Account>();
        result.put(account.getAccountNumber(), account);
        teller.addAccount(account);
        assertEquals(result, teller.getAccountRepository().getAccounts());
    }

    @Test
    void testAddUser() {
        User user = new User();
        Map<Long, User> result = new HashMap<Long, User>();
        result.put(user.getId(), user);
        Teller teller = new Teller();
        teller.addUser(user);
        assertEquals(result, teller.getUserRepository().getUsers());
    }

    @Test
    void testAddUserAndAccount() {
        User user = new User();
        Account account = new Account();
        Map<User, Account> result = new HashMap<User, Account>();
        result.put(user, account);
        Teller teller = new Teller();
        teller.addUserAndAccount(user, account);
        assertEquals(result, teller.getUserAccountRepository().getUserAccounts());
    }

    @Test
    void testGetAccountRepository() {
        AccountRepository accountRepository = new AccountRepository();
        Teller teller = new Teller();
        teller.setAccountRepository(accountRepository);
        AccountRepository result = accountRepository;
        assertEquals(result, teller.getAccountRepository());
    }

    @Test
    void testGetUserAccountRepository() {
        UserAccountRepository userAccountRepository = new UserAccountRepository();
        Teller teller = new Teller();
        teller.setUserAccountRepository(userAccountRepository);
        UserAccountRepository result = userAccountRepository;
        assertEquals(result, teller.getUserAccountRepository());
    }

    @Test
    void testGetUserRepository() {
        UserRepository userRepository = new UserRepository();
        Teller teller = new Teller();
        teller.setUserRepository(userRepository);
        UserRepository result = userRepository;
        assertEquals(result, teller.getUserRepository());
    }

    @Test
    void testSetAccountRepository() {
        AccountRepository accountRepository = new AccountRepository();
        Teller teller = new Teller();
        teller.setAccountRepository(accountRepository);
        AccountRepository result = accountRepository;
        assertEquals(result, teller.getAccountRepository());
    }

    @Test
    void testSetUserAccountRepository() {
        UserAccountRepository userAccountRepository = new UserAccountRepository();
        Teller teller = new Teller();
        teller.setUserAccountRepository(userAccountRepository);
        UserAccountRepository result = userAccountRepository;
        assertEquals(result, teller.getUserAccountRepository());
    }

    @Test
    void testSetUserRepository() {
        UserRepository userRepository = new UserRepository();
        Teller teller = new Teller();
        teller.setUserRepository(userRepository);
        UserRepository result = userRepository;
        assertEquals(result, teller.getUserRepository());
    }

    @Test
    void testToString() {
        Teller teller = new Teller();
        String result = "Teller [accountRepository=" + teller.getAccountRepository() + ", userAccountRepository=" 
                + teller.getUserAccountRepository() + ", userRepository=" + teller.getUserRepository() + "]";
        assertEquals(result, teller.toString());
    }
    
}
