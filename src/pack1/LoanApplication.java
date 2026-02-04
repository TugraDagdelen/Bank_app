package pack1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

public class LoanApplication {

	private JFrame frame;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoanApplication window = new LoanApplication();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public LoanApplication() {
		initialize();
	}


	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton personalloanBtn = new JButton("Personal Loan");
		personalloanBtn.setBounds(136, 40, 117, 29);
		frame.getContentPane().add(personalloanBtn);
		
		personalloanBtn.addActionListener(e -> {
		    frame.dispose();
		    new ApplicationForm();
		});
		
		JButton btnVehicle = new JButton("Vehicle Loan");
		btnVehicle.setBounds(136, 94, 117, 29);
		frame.getContentPane().add(btnVehicle);
		
		
		
		btnVehicle.addActionListener(e -> {
		    frame.dispose();
		    new ApplicationForm();
		});
		
		
		JButton btnHousingLoan = new JButton("Housing Loan");
		btnHousingLoan.setBounds(136, 144, 117, 29);
		frame.getContentPane().add(btnHousingLoan);
		
		btnHousingLoan.addActionListener(e -> {
		    frame.dispose();
		    new ApplicationForm();
		});
		
		
		
		frame.setVisible(true);
		
		
		JButton backBtn = new JButton("Back");
		backBtn.setBounds(6, 223, 80, 25);
		frame.getContentPane().add(backBtn);
		backBtn.addActionListener(e -> {
		    frame.dispose();
		    new MenuPage();
		});

		
		
	}

}
