package pack1;

import javax.swing.*;

public class PayDebtPage {
    private JFrame frame;

    public PayDebtPage() {
        frame = new JFrame("Pay Debt");
        frame.setBounds(100, 100, 400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel label = new JLabel("Pay Debt Page");
        label.setBounds(117, 10, 150, 30);
        frame.getContentPane().add(label);

        JButton backButton = new JButton("Back");
        backButton.setBounds(10, 220, 80, 25);
        frame.getContentPane().add(backButton);
        
        JTextArea textArea = new JTextArea();
        textArea.setBounds(33, 87, 234, 61);
        frame.getContentPane().add(textArea);
        
        JLabel lblNewLabel = new JLabel("Total Debt");
        lblNewLabel.setBounds(29, 51, 80, 26);
        frame.getContentPane().add(lblNewLabel);
        
        JButton btnDebtPayment = new JButton("Debt Payment");
        btnDebtPayment.setBounds(100, 162, 120, 21);
        frame.getContentPane().add(btnDebtPayment);

        backButton.addActionListener(e -> {
            frame.dispose();
            new CreditCardPage();
        });

        frame.setVisible(true);
    }
}
