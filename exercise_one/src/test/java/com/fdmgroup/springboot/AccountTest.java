package com.fdmgroup.springboot;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

public class AccountTest {

    @Test
    void testGetAccountNumber() {
        Account account = new Account();
        Long result = 1111L;
        assertEquals(result, account.getAccountNumber());
    }

    @Test
    void testGetBalance() {
        Account account = new Account();
        BigDecimal result = new BigDecimal(0);
        assertEquals(result, account.getBalance());
    }

    @Test
    void testSetAccountNumber() {
        Account account = new Account();
        Long result = 2222L;
        account.setAccountNumber(result);
        assertEquals(result, account.getAccountNumber());
    }

    @Test
    void testSetBalance() {
        Account account = new Account();
        BigDecimal result = new BigDecimal(100);
        account.setBalance(result);
        assertEquals(result, account.getBalance());
    }

    @Test
    void testToString() {
        Account account = new Account();
        String result = "Account [accountNumber=" + account.getAccountNumber() + ", balance=" + account.getBalance() + "]";
        assertEquals(result, account.toString());
    }


}
