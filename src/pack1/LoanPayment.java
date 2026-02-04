package pack1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;

public class LoanPayment {

	private JFrame frame;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoanPayment window = new LoanPayment();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public LoanPayment() {
		initialize();
	}


	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(239, 24, 82, 16);
		frame.getContentPane().add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(239, 57, 82, 16);
		frame.getContentPane().add(textArea_1);
		
		JButton btnNewButton = new JButton("Pay");
		btnNewButton.setBounds(143, 118, 117, 29);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblavailablebalance2 = new JLabel("Available Balance");
		lblavailablebalance2.setBounds(23, 24, 117, 16);
		frame.getContentPane().add(lblavailablebalance2);
		
		JLabel lblmountlyıntallmentamount = new JLabel("Mounthly Intallment Amount");
		lblmountlyıntallmentamount.setBounds(23, 57, 192, 16);
		frame.getContentPane().add(lblmountlyıntallmentamount);
		
		
		frame.setVisible(true);
		
		JButton backBtn = new JButton("Back");
		backBtn.setBounds(6, 224, 80, 25);
		frame.getContentPane().add(backBtn);
		backBtn.addActionListener(e -> {
		    frame.dispose();
		    new LoanTransactions();
		});

		
		
	}

}
