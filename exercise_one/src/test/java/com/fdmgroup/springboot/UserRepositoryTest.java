package com.fdmgroup.springboot;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class UserRepositoryTest {
    @Test
    void testAddUser() {
        UserRepository userRepository = new UserRepository();
        User user = new User();
        userRepository.addUser(user);
        Map<Long, User> result = new HashMap<Long, User>();
        result.put(user.getId(), user);
        assertEquals(result, userRepository.getUsers());
    }

    @Test
    void testGetUsers() {
        UserRepository userRepository = new UserRepository();
        Map<Long, User> result = new HashMap<Long, User>();
        assertEquals(result, userRepository.getUsers());
    }

    @Test
    void testRemoveUser() {
        UserRepository userRepository = new UserRepository();
        User user = new User();
        userRepository.addUser(user);
        userRepository.removeUser(user);
        Map<Long, User> result = new HashMap<Long, User>();
        assertEquals(result, userRepository.getUsers());
    }

    @Test
    void testSetUsers() {
        UserRepository userRepository = new UserRepository();
        User user = new User();
        Map<Long, User> result = new HashMap<Long, User>();
        result.put(user.getId(), user);
        userRepository.setUsers(result);
        assertEquals(result, userRepository.getUsers());
    }

    @Test
    void testToString() {
        UserRepository userRepository = new UserRepository();
        String result = "UserRepositoryTest [users=" + userRepository.getUsers() + "]";
        assertEquals(result, userRepository.toString());
    }
}
