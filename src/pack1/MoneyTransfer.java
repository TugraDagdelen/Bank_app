package pack1;

import javax.swing.*;

public class MoneyTransfer {

    private JFrame frame;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;

    public MoneyTransfer() {
        initialize();
        frame.setVisible(true);
    }

    private void initialize() {
        frame = new JFrame("Money Transfer");
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblIban = new JLabel("IBAN");
        lblIban.setBounds(21, 117, 61, 16);
        frame.getContentPane().add(lblIban);

        JLabel lblNameSurname = new JLabel("Name Surname");
        lblNameSurname.setBounds(21, 145, 105, 16);
        frame.getContentPane().add(lblNameSurname);

        JLabel lblAmount = new JLabel("Amount");
        lblAmount.setBounds(21, 178, 61, 16);
        frame.getContentPane().add(lblAmount);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(21, 6, 405, 78);
        frame.getContentPane().add(textArea);

        textField = new JTextField();
        textField.setBounds(130, 112, 130, 26);
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(130, 140, 130, 26);
        frame.getContentPane().add(textField_1);

        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(130, 173, 130, 26);
        frame.getContentPane().add(textField_2);

        JButton backButton = new JButton("Back");
        backButton.setBounds(10, 230, 80, 25);
        frame.getContentPane().add(backButton);

        backButton.addActionListener(e -> {
            frame.dispose();
            new MenuPage();
        });

        
        
        
        JButton btnSend = new JButton("SEND");
        btnSend.setBounds(130, 217, 117, 29);
        frame.getContentPane().add(btnSend);
        
        
        
        
        
        
        
        
    }
}
