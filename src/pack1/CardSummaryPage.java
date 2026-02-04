package pack1;

import javax.swing.*;

public class CardSummaryPage {
    public CardSummaryPage(String title) {
        JFrame frame = new JFrame(title);
        frame.setBounds(100, 100, 300, 150);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel summaryLabel = new JLabel(title + ": Örnek özet bilgisi");
        summaryLabel.setBounds(30, 30, 250, 14);
        frame.getContentPane().add(summaryLabel);

        frame.setVisible(true);
    }
}

