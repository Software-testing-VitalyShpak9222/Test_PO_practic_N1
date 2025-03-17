package org.example;

public class LoginForm {
    private String username;
    private String password;

    public LoginForm() {}

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean validate() {
        return username != null && !username.isEmpty() && password != null && !password.isEmpty();
    }
}

