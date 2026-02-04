
package pack1;

import javax.swing.*;

public class CashAdvancesPage {
    private JFrame frame;
    private JTextField textField;

    public CashAdvancesPage() {
        frame = new JFrame("Cash Advance");
        frame.setBounds(100, 100, 586, 475);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel label = new JLabel("Cash Advance Page");
        label.setBounds(202, 33, 150, 30);
        frame.getContentPane().add(label);

        JButton backButton = new JButton("Back");
        backButton.setBounds(10, 403, 80, 25);
        frame.getContentPane().add(backButton);
        
        JTextArea textArea = new JTextArea();
        textArea.setBounds(26, 263, 233, 114);
        frame.getContentPane().add(textArea);
        
        JButton CashAdvanceBtn = new JButton("Get Cash Advance");
        CashAdvanceBtn.setBounds(311, 327, 169, 40);
        frame.getContentPane().add(CashAdvanceBtn);
        
        textField = new JTextField();
        textField.setBounds(212, 73, 169, 30);
        frame.getContentPane().add(textField);
        textField.setColumns(10);
        
        JLabel lblTransactionAmount = new JLabel("Transaction Amount");
        lblTransactionAmount.setBounds(26, 61, 150, 50);
        frame.getContentPane().add(lblTransactionAmount);
        
        JLabel lblMontlyInstallment = new JLabel("Monthly Installment");
        lblMontlyInstallment.setBounds(26, 121, 169, 40);
        frame.getContentPane().add(lblMontlyInstallment);
        
        JLabel lblInterestRate = new JLabel("Interest Rate");
        lblInterestRate.setBounds(26, 171, 166, 50);
        frame.getContentPane().add(lblInterestRate);
        
        JComboBox Monthlycombobox = new JComboBox();
        Monthlycombobox.setBounds(212, 131, 176, 30);
        frame.getContentPane().add(Monthlycombobox);
        
        JTextArea textArea_1 = new JTextArea();
        textArea_1.setBounds(212, 177, 176, 30);
        frame.getContentPane().add(textArea_1);
        
        JButton btnNewButton = new JButton("Calculate");
        btnNewButton.setBounds(395, 238, 85, 21);
        frame.getContentPane().add(btnNewButton);

        backButton.addActionListener(e -> {
            frame.dispose();
            new CreditCardPage();
        });

        frame.setVisible(true);
    }
}