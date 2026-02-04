package pack1;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoanTransactions {

    private JFrame frame;

    public LoanTransactions() {
        initialize();
        frame.setVisible(true);
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JButton CreditBtn = new JButton("My Loans");
        CreditBtn.setBounds(144, 6, 142, 29);
        frame.getContentPane().add(CreditBtn);
        
        
        CreditBtn.addActionListener(e -> {
            frame.dispose();
            new MyLoansPage();
        });
        
        
        
        

        JButton LoanPaymentBtn = new JButton("Loan Payment");
        LoanPaymentBtn.setBounds(144, 47, 142, 29);
        frame.getContentPane().add(LoanPaymentBtn);
        
        LoanPaymentBtn.addActionListener(e -> {
            frame.dispose();
            new LoanPayment();
        });
        
        
        
        
        

        JButton LoanApplicationBtn = new JButton("Loan Application");
        LoanApplicationBtn.setBounds(144, 89, 142, 29);
        frame.getContentPane().add(LoanApplicationBtn);
        
        
        
        LoanApplicationBtn.addActionListener(e -> {
            frame.dispose();
            new LoanApplication();
        });
        
        
        
        
        
        JButton backButton = new JButton("Back");
        backButton.setBounds(10, 220, 80, 25);
        frame.getContentPane().add(backButton);

        backButton.addActionListener(e -> {
            frame.dispose();
            new MenuPage();
        });
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            new LoanTransactions();
        });
    }
}
