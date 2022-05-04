package com.fdmgroup.springboot;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    void testGetId() {
        User user = new User();
        Long result = 0L;
        assertEquals(result, user.getId());
    }

    @Test
    void testGetName() {
        User user = new User();
        String result = "default name";
        assertEquals(result, user.getName());
    }

    @Test
    void testSetId() {
        User user = new User();
        Long result = 1L;
        user.setId(result);
        assertEquals(result, user.getId());
    }

    @Test
    void testSetName() {
        User user = new User();
        String result = "new name";
        user.setName(result);
        assertEquals(result, user.getName());
    }

    @Test
    void testToString() {
        User user = new User();
        String result = "User [id=" + user.getId() + ", name=" + user.getName() + "]";
        assertEquals(result, user.toString());
    }
   
}
