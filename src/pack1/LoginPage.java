package pack1;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage {

    private JFrame frame;
    private JTextField nameField;
    private JPasswordField passwordField;


    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                LoginPage window = new LoginPage();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }


    public LoginPage() {
        initialize();
    }


    private void initialize() {
        frame = new JFrame();
        frame.setTitle("Giriş Yap");
        frame.setBounds(100, 100, 400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel nameLabel = new JLabel("Ad-Soyad:");
        nameLabel.setBounds(50, 40, 120, 20);
        frame.getContentPane().add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(180, 40, 150, 20);
        frame.getContentPane().add(nameField);
        nameField.setColumns(10);

        JLabel passwordLabel = new JLabel("Şifre:");
        passwordLabel.setBounds(50, 80, 120, 20);
        frame.getContentPane().add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(180, 80, 150, 20);
        frame.getContentPane().add(passwordField);

        JButton loginButton = new JButton("Giriş Yap");
        loginButton.setBounds(130, 130, 120, 30);
        frame.getContentPane().add(loginButton);

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String password = new String(passwordField.getPassword());

                if (!name.isEmpty() && !password.isEmpty()) {
                    User user = new User(name, password);

                    frame.dispose();

                    new MainPanel(user);
                } else {
                    JOptionPane.showMessageDialog(frame, "Lütfen tüm alanları doldurun.");
                }
            }
        });
    }
}

