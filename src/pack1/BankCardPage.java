package pack1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankCardPage {

    private JFrame frame;

 
    public BankCardPage() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setTitle("Bank Card");
        frame.setBounds(100, 100, 400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JButton accountSummaryButton = new JButton("Account Summary");
        accountSummaryButton.setBounds(120, 60, 150, 30);
        frame.getContentPane().add(accountSummaryButton);

        accountSummaryButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Account Summary selected.");
            }
        });

        JButton backButton = new JButton("Back");
        backButton.setBounds(10, 130, 80, 25);
        frame.getContentPane().add(backButton);

        backButton.addActionListener(e -> {
            frame.dispose();
            new MenuPage();
        });

        
        
        

        frame.setVisible(true);
    }


    public static void main(String[] args) {
        new BankCardPage();
    }
}
