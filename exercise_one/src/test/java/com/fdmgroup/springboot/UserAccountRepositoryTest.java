package com.fdmgroup.springboot;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class UserAccountRepositoryTest {
    @Test
    void testAddUserAndAccount() {
        UserAccountRepository userAccountRepository = new UserAccountRepository();
        User user = new User();
        Account account = new Account();
        Map<User, Account> result = new HashMap<User, Account>();
        result.put(user, account);
        userAccountRepository.addUserAndAccount(user, account);
        assertEquals(result, userAccountRepository.getUserAccounts());
    }

    @Test
    void testGetUserAccounts() {
        UserAccountRepository userAccountRepository = new UserAccountRepository();
        User user = new User();
        Account account = new Account();
        Map<User, Account> result = new HashMap<User, Account>();
        result.put(user, account);
        userAccountRepository.addUserAndAccount(user, account);
        assertEquals(result, userAccountRepository.getUserAccounts());
    }

    @Test
    void testRemoveAccount() {
        UserAccountRepository userAccountRepository = new UserAccountRepository();
        Map<User, Account> result = new HashMap<User, Account>();
        User user = new User();
        Account account = new Account();
        userAccountRepository.addUserAndAccount(user, account);
        userAccountRepository.removeAccount(account);
        assertEquals(result, userAccountRepository.getUserAccounts());
    }

    @Test
    void testRemoveUser() {
        UserAccountRepository userAccountRepository = new UserAccountRepository();
        Map<User, Account> result = new HashMap<User, Account>();
        User user = new User();
        Account account = new Account();
        userAccountRepository.addUserAndAccount(user, account);
        userAccountRepository.removeUser(user);
        assertEquals(result, userAccountRepository.getUserAccounts());
    }

    @Test
    void testSetUserAccounts() {
        UserAccountRepository userAccountRepository = new UserAccountRepository();
        User user = new User();
        Account account = new Account();
        Map<User, Account> result = new HashMap<User, Account>();
        result.put(user, account);
        userAccountRepository.setUserAccounts(result);
        assertEquals(result, userAccountRepository.getUserAccounts());
    }

    @Test
    void testToString() {
        UserAccountRepository userAccountRepository = new UserAccountRepository();
        String result = "UserAccountRepository [userAccounts=" + userAccountRepository.getUserAccounts() + "]";
        assertEquals(result, userAccountRepository.toString());
    }
}
