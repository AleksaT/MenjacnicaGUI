package menjacnica.gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ObrisiKursGUI extends JFrame {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public GUI GP; 
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JTextField textField_1;
	private JLabel lblNewLabel_2;
	private JTextField textField_2;
	private JLabel lblNewLabel_3;
	private JTextField textField_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField textField_4;
	private JTextField textField_5;
	private JCheckBox chckbxNewCheckBox;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public ObrisiKursGUI(GUI GP) {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent arg0) {
				
			}
		});
		setTitle("Obrisi kurs");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 270, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getTextField());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getTextField_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getTextField_2());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getTextField_3());
		contentPane.add(getLblNewLabel_4());
		contentPane.add(getLblNewLabel_5());
		contentPane.add(getTextField_4());
		contentPane.add(getTextField_5());
		contentPane.add(getChckbxNewCheckBox());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_1());
		this.GP = GP;
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Sifra");
			lblNewLabel.setBounds(10, 11, 46, 14);
		}
		return lblNewLabel;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setEditable(false);
			textField.setBounds(10, 36, 86, 20);
			textField.setColumns(10);
		}
		return textField;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Naziv");
			lblNewLabel_1.setBounds(152, 11, 86, 14);
		}
		return lblNewLabel_1;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setEditable(false);
			textField_1.setBounds(152, 36, 86, 20);
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Prodajni kurs");
			lblNewLabel_2.setBounds(10, 67, 86, 14);
		}
		return lblNewLabel_2;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setEditable(false);
			textField_2.setBounds(10, 92, 86, 20);
			textField_2.setColumns(10);
		}
		return textField_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("Kupovni kurs");
			lblNewLabel_3.setBounds(152, 67, 86, 14);
		}
		return lblNewLabel_3;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setEditable(false);
			textField_3.setBounds(152, 92, 86, 20);
			textField_3.setColumns(10);
		}
		return textField_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("Srednji kurs");
			lblNewLabel_4.setBounds(10, 123, 86, 14);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("Skraceni naziv");
			lblNewLabel_5.setBounds(152, 123, 86, 14);
		}
		return lblNewLabel_5;
	}
	private JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setEditable(false);
			textField_4.setBounds(10, 148, 86, 20);
			textField_4.setColumns(10);
		}
		return textField_4;
	}
	private JTextField getTextField_5() {
		if (textField_5 == null) {
			textField_5 = new JTextField();
			textField_5.setEditable(false);
			textField_5.setBounds(152, 148, 86, 20);
			textField_5.setColumns(10);
		}
		return textField_5;
	}
	private JCheckBox getChckbxNewCheckBox() {
		if (chckbxNewCheckBox == null) {
			chckbxNewCheckBox = new JCheckBox("Zaista obrisi kurs");
			chckbxNewCheckBox.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(chckbxNewCheckBox.isSelected()) btnNewButton.setEnabled(true);
				}
			});
			chckbxNewCheckBox.setBounds(6, 185, 148, 23);
		}
		return chckbxNewCheckBox;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Obrisi");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						String sifra = textField.getText();
						String skraceniN = textField_1.getText();
						double prodajni = Double.parseDouble(textField_2.getText());
						double srednji = Double.parseDouble(textField_3.getText());
						double kupovni = Double.parseDouble(textField_4.getText());
						String naziv = textField_5.getText();
						String string = "Sifra:"+sifra+"Skraceni naziv kursa: "+skraceniN+"Prodajni kurs: "+prodajni+"Kupovni kurs: "+kupovni+"Srednji kurs: "+srednji+"Naziv kursa: "+naziv;
						GP.dodajStatus(string);
					} catch (NumberFormatException e) {
						GP.dodajStatus("Nije izabran nijedan kurs. Polja su prazna");
						e.printStackTrace();
					}
				}
			});
			btnNewButton.setEnabled(false);
			btnNewButton.setBounds(10, 224, 89, 23);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Odustani");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
			btnNewButton_1.setBounds(152, 224, 89, 23);
		}
		return btnNewButton_1;
	}
}
