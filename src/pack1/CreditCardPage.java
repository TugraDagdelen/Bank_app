package pack1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreditCardPage {

    private JFrame frame;

    public CreditCardPage() {
        initialize();
        frame.setVisible(true);
    }

    private void initialize() {
        frame = new JFrame();
        frame.setTitle("Credit Card");
        frame.setBounds(100, 100, 400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JButton cashAdvanceButton = new JButton("Cash Advance");
        cashAdvanceButton.setBounds(120, 40, 150, 30);
        frame.getContentPane().add(cashAdvanceButton);

        JButton statementButton = new JButton("Statement");
        statementButton.setBounds(120, 90, 150, 30);
        frame.getContentPane().add(statementButton);

        JButton payDebtButton = new JButton("Pay Debt");
        payDebtButton.setBounds(120, 140, 150, 30);
        frame.getContentPane().add(payDebtButton);
        
        JButton backButton = new JButton("Back");
        backButton.setBounds(10, 220, 80, 25);
        frame.getContentPane().add(backButton);

        backButton.addActionListener(e -> {
            frame.dispose();
            new MenuPage();
        });


        cashAdvanceButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new CashAdvancesPage();
            }
        });

        statementButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new StatementPage();
            }
        });

        payDebtButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new PayDebtPage();
            }
        });
    }
}