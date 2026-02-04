package pack1;

import javax.swing.*;
import java.awt.event.*;

public class MainPanel {
    private JFrame frmMainPage;

    public MainPanel(User user) {
        frmMainPage = new JFrame("Ana Sayfa");
        frmMainPage.setTitle("Main Page");
        frmMainPage.setBounds(100, 100, 478, 347);
        frmMainPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmMainPage.getContentPane().setLayout(null);

        JLabel lblBalance = new JLabel("Available Balance");
        lblBalance.setBounds(167, 43, 115, 14);
        frmMainPage.getContentPane().add(lblBalance);

        JButton menuBtn = new JButton("Menu");
        menuBtn.setBounds(6, 6, 80, 23);
        frmMainPage.getContentPane().add(menuBtn);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(133, 135, 205, 165);
        frmMainPage.getContentPane().add(scrollPane);
        
        JTextArea textArea = new JTextArea();
        textArea.setBounds(122, 54, 1, 16);
        frmMainPage.getContentPane().add(textArea);
        
        JTextArea textArea_iban = new JTextArea();
        textArea_iban.setBounds(179, 66, 103, 30);
        frmMainPage.getContentPane().add(textArea_iban);
        
        JTextArea textArea_2 = new JTextArea();
        textArea_2.setBounds(122, 107, 226, 16);
        frmMainPage.getContentPane().add(textArea_2);

        menuBtn.addActionListener(e -> {
            frmMainPage.dispose();
            new MenuPage();
        });

        frmMainPage.setVisible(true);
    }
}

