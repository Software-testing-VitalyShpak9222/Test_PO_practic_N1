package org.example;

public class LoginServer {
    public boolean authenticate(String username, String password) {
        return "user".equals(username) && "password".equals(password);
    }
}
