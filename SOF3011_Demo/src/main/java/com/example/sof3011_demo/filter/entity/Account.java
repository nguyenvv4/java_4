package com.example.sof3011_demo.filter.entity;

//fake bảng account
public class Account {


    private String username;
    private String password;
    private AccountRole role;

    public Account() {}

    public Account(String username, String password, AccountRole role) {
        super();
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public AccountRole getRole() {
        return role;
    }
    public void setRole(AccountRole role) {
        this.role = role;
    }
}
