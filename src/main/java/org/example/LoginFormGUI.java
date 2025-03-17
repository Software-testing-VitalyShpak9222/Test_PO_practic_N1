package org.example;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LoginFormGUI {
    private JFrame frame;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JLabel messageLabel;

    public LoginFormGUI() {

        frame = new JFrame("Форма авторизации");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null);

        JLabel usernameLabel = new JLabel("Логин:");
        usernameLabel.setBounds(50, 50, 100, 30);
        frame.add(usernameLabel);

        usernameField = new JTextField();
        usernameField.setBounds(150, 50, 200, 30);
        frame.add(usernameField);

        JLabel passwordLabel = new JLabel("Пароль:");
        passwordLabel.setBounds(50, 100, 100, 30);
        frame.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(150, 100, 200, 30);
        frame.add(passwordField);

        loginButton = new JButton("Войти");
        loginButton.setBounds(150, 150, 100, 30);
        frame.add(loginButton);

        messageLabel = new JLabel();
        messageLabel.setBounds(50, 200, 300, 30);
        frame.add(messageLabel);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleLogin();
            }
        });

        frame.setVisible(true);
    }

    private void handleLogin() {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        LoginServer server = new LoginServer();

        if (username.isEmpty() || password.isEmpty()) {
            messageLabel.setText("Ошибка: Пожалуйста, заполните все поля.");
        } else {
            if (server.authenticate(username, password)) {
                messageLabel.setText("Аутентификация успешна!");
            } else {
                messageLabel.setText("Ошибка аутентификации. Неверные данные.");
            }
        }
    }

    public static void main(String[] args) {
        new LoginFormGUI();
    }
}

