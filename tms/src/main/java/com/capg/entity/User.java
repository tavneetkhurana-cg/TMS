package com.capg.entity;

public class User {

   private long Id;
   private String userName;
  private String password;

    private UserRole role;



    // Getters and Setters
    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

   public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

enum UserRole {
    ADMIN, USER
}
