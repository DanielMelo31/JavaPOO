package com.library.model;

public abstract class User {
    private int id;
    private String name;
    private String lastName;
    private String role;


    public User(String name, String lastName, String role) {
        this.id = ++id;
        this.name = name;
        this.lastName = lastName;
        this.role = role;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getFullName() {
        String fullName = name + " " + lastName;

        return fullName;
    }

}
