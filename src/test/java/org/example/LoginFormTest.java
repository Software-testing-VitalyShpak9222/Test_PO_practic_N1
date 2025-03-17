package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginFormTest {

    @Test
    public void testValidLogin() {
        LoginForm loginForm = new LoginForm();
        loginForm.setUsername("user");
        loginForm.setPassword("password");
        assertTrue(loginForm.validate(), "Форма должна быть валидной");
    }

    @Test
    public void testInvalidLoginEmptyUsername() {
        LoginForm loginForm = new LoginForm();
        loginForm.setUsername("");
        loginForm.setPassword("password");
        assertFalse(loginForm.validate(), "Форма должна быть невалидной без логина");
    }

    @Test
    public void testInvalidLoginEmptyPassword() {
        LoginForm loginForm = new LoginForm();
        loginForm.setUsername("user");
        loginForm.setPassword("");
        assertFalse(loginForm.validate(), "Форма должна быть невалидной без пароля");
    }

    @Test
    public void testInvalidLoginBothFieldsEmpty() {
        LoginForm loginForm = new LoginForm();
        loginForm.setUsername("");
        loginForm.setPassword("");
        assertFalse(loginForm.validate(), "Форма должна быть невалидной, если оба поля пусты");
    }
}

