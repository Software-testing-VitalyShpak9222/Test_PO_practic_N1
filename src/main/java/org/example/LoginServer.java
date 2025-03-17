package org.example;

public class LoginServer {
    public boolean authenticate(String username, String password) {
        // Для простоты, используем фиксированные данные для аутентификации
        return "user".equals(username) && "password".equals(password);
    }
}
