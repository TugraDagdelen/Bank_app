package pack1;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MyLoansPage {

	private JFrame frame;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyLoansPage window = new MyLoansPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MyLoansPage() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(46, 33, 357, 196);
		frame.getContentPane().add(textArea);
		
		
		frame.setVisible(true);
		
		JButton backBtn = new JButton("Back");
		backBtn.setBounds(6, 241, 80, 25);
		frame.getContentPane().add(backBtn);
		backBtn.addActionListener(e -> {
		    frame.dispose();
		    new LoanTransactions();
		});

	}

}
