package pack1;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.*;

public class ApplicationForm {

	private JFrame frame;
	private JTextField textField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ApplicationForm window = new ApplicationForm();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ApplicationForm() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 480, 320);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JTextArea textArea = new JTextArea();
		textArea.setText("%4.69");
		textArea.setEditable(false);
		textArea.setBounds(149, 39, 52, 16);
		frame.getContentPane().add(textArea);

		JComboBox<String> comboBoxperiod = new JComboBox<>();
		comboBoxperiod.setBounds(149, 96, 52, 27);
		for (int i = 1; i < 13; i++) {
		    comboBoxperiod.addItem(String.valueOf(i));
		}

		frame.getContentPane().add(comboBoxperiod);

		JLabel lblNewLabel = new JLabel("Period (Year)");
		lblNewLabel.setBounds(10, 100, 100, 16);
		frame.getContentPane().add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(122, 135, 79, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblamount = new JLabel("Amount (₺)");
		lblamount.setBounds(10, 152, 100, 16);
		frame.getContentPane().add(lblamount);

		JLabel interestrateLbl = new JLabel("Interest Rate");
		interestrateLbl.setBounds(10, 39, 112, 16);
		frame.getContentPane().add(interestrateLbl);

		JTextArea textArea_1 = new JTextArea();
		textArea_1.setEditable(false);
		textArea_1.setBounds(254, 19, 190, 208);
		frame.getContentPane().add(textArea_1);

		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setBounds(105, 185, 117, 29);
		frame.getContentPane().add(btnCalculate);

		JButton btnApply = new JButton("APPLY");
		btnApply.setBounds(105, 215, 117, 29);
		frame.getContentPane().add(btnApply);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(e -> {
            frame.dispose();
            new LoanApplication();
        });
		btnBack.setBounds(6, 245, 117, 29);
		frame.getContentPane().add(btnBack);
		frame.setVisible(true);

		
		
		


		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double faizOrani = 0.0469;
					double tutar = Double.parseDouble(textField.getText());
					int yil = Integer.parseInt((String) comboBoxperiod.getSelectedItem());

					double faiz = tutar * faizOrani * yil;
					double toplam = tutar + faiz;

					textArea_1.setText("Toplam Faiz: " + String.format("%.2f", faiz) + " ₺\n" +
									   "Toplam Ödeme: " + String.format("%.2f", toplam) + " ₺");

				} catch (NumberFormatException ex) {
					textArea_1.setText("Lütfen geçerli tutar girin.");
				}
			}
		});
	}
}
