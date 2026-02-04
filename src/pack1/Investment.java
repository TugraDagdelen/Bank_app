package pack1;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Investment {

    private JFrame frmInvestment;

    public Investment() {
        initialize();
    }


    private void initialize() {
        frmInvestment = new JFrame();
        frmInvestment.setTitle("Investment");
        frmInvestment.setBounds(100, 100, 450, 300);
        frmInvestment.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmInvestment.getContentPane().setLayout(null);

        JList<String> list = new JList<>(new String[]{"Stock A", "Stock B", "Crypto X", "Crypto Y"});
        list.setBounds(21, 6, 147, 222);
        frmInvestment.getContentPane().add(list);

        JTextArea priceTxtArea = new JTextArea("Price: ");
        priceTxtArea.setEditable(false);
        priceTxtArea.setBounds(217, 60, 117, 20);
        frmInvestment.getContentPane().add(priceTxtArea);

        JButton buyBtn = new JButton("BUY");
        buyBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frmInvestment, "Buy order placed for: " + list.getSelectedValue());
            }
        });
        buyBtn.setBounds(217, 88, 117, 29);
        frmInvestment.getContentPane().add(buyBtn);

        JButton sellBtn = new JButton("SELL");
        sellBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frmInvestment, "Sell order placed for: " + list.getSelectedValue());
            }
        });
        sellBtn.setBounds(217, 117, 117, 29);
        frmInvestment.getContentPane().add(sellBtn);
        
        JButton backButton = new JButton("Back");
        backButton.setBounds(6, 240, 80, 25);
        frmInvestment.getContentPane().add(backButton);

        backButton.addActionListener(e -> {
            frmInvestment.dispose();
            new MenuPage();
        });

        
        
        
        


        frmInvestment.setVisible(true);
    }

    public static void main(String[] args) {
        new Investment();
    }
}
