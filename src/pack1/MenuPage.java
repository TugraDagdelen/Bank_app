package pack1;

import javax.swing.*;
import java.awt.event.*;

public class MenuPage {
    private JFrame frame;

    public MenuPage() {
        frame = new JFrame("Menü");
        frame.setBounds(100, 100, 464, 373);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JButton transferBtn = new JButton("Money Transfers");
        transferBtn.setBounds(111, 83, 200, 23);
        frame.getContentPane().add(transferBtn);
        transferBtn.addActionListener(e -> {
            frame.dispose();
            new MoneyTransfer();
        });

        JButton card1Btn = new JButton("Credit Card");
        card1Btn.setBounds(111, 118, 200, 23);
        frame.getContentPane().add(card1Btn);
        card1Btn.addActionListener(e -> {
            frame.dispose();
            new CreditCardPage();
        });

        JButton btnBankCard = new JButton("Bank Card");
        btnBankCard.setBounds(111, 150, 200, 29);
        frame.getContentPane().add(btnBankCard);
        btnBankCard.addActionListener(e -> {
            frame.dispose();
            new BankCardPage();
        });

        JButton investmentBtn = new JButton("Investment");
        investmentBtn.setBounds(111, 181, 200, 29);
        frame.getContentPane().add(investmentBtn);
        investmentBtn.addActionListener(e -> {
            frame.dispose();
            new Investment();
        });

        JButton loanBtn = new JButton("Loan Transactions");
        loanBtn.setBounds(111, 211, 200, 29);
        frame.getContentPane().add(loanBtn);
        loanBtn.addActionListener(e -> {
            frame.dispose();
            new LoanTransactions();
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new MenuPage();
    }
}
