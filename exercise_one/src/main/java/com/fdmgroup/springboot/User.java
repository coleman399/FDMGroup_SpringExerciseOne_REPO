package com.fdmgroup.springboot;

public class User {
    private String name;
    private Long id;

    public User() {
        id = 0L;
        name = "default name";
    }

    public User(String name, Long id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + "]";
    }

}
