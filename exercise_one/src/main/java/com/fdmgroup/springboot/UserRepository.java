package com.fdmgroup.springboot;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private Map<Long, User> users;

    public UserRepository() {
        users = new HashMap<Long, User>();
    }

    public UserRepository(Map<Long, User> users) {
        this.users = users;
    }

    public Map<Long, User> getUsers() {
        return users;
    }

    public void setUsers(Map<Long, User> users) {
        this.users = users;
    }

    public void addUser(User user) {
        users.put(user.getId(), user);
    }

    public void removeUser(User user) {
        users.remove(user.getId(), user);
    }

    @Override
    public String toString() {
        return "UserRepositoryTest [users=" + users + "]";
    }

}