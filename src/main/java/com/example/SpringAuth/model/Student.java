package com.example.SpringAuth.model;

public class Student {
    private int id;
    private String name;
    private String password;

    // Parameterized constructor
    public Student(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Setter for id
    public void setId(int id) {
        this.id = id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for password
    public String getPassword() {
        return password;
    }

    // Setter for password
    public void setPassword(String password) {
        this.password = password;
    }

}
