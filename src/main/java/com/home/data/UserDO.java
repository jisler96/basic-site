package com.home.data;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
public class UserDO {
    private Long id;
    @NotEmpty(message = "Username is required")
    private String username;
    private String password;

    // Constructors
    public UserDO() {
    }

    public UserDO(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
