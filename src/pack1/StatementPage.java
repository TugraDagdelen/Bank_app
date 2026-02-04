package pack1;

import javax.swing.*;

public class StatementPage {
    private JFrame frame;

    public StatementPage() {
        frame = new JFrame("Statement");
        frame.setBounds(100, 100, 400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel label = new JLabel("Statement Page");
        label.setBounds(118, 24, 150, 30);
        frame.getContentPane().add(label);

        JButton backButton = new JButton("Back");
        backButton.setBounds(10, 220, 80, 25);
        frame.getContentPane().add(backButton);
        
        JTextArea textArea = new JTextArea();
        textArea.setBounds(40, 70, 298, 120);
        frame.getContentPane().add(textArea);

        backButton.addActionListener(e -> {
            frame.dispose();
            new CreditCardPage();
        });

        frame.setVisible(true);
    }
}
