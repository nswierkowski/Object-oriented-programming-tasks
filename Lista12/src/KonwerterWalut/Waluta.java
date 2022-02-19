package KonwerterWalut;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import KonwerterWalut.Waluta;

public class Waluta {

	JButton przycisk1;
	JLabel label1;
	JLabel label2;
	JTextField tekst1;
	JTextField tekst2;
	JFrame ramka;
	JPanel panel;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Waluta w = new Waluta();
		w.Ramka();
	}

	public void Ramka() {
		
		przycisk1 = new JButton("Wyczyść pola");
		przycisk1.addActionListener(new Wyczyść());
		
		label1 = new JLabel("Złoty ");
		label2 = new JLabel("Euro ");
		
		tekst1 = new JTextField(10);
		tekst1.setText("");
		tekst1.addActionListener(new ZlotyNaEuro());

		tekst2 = new JTextField(10);
		tekst2.setText("");
		tekst2.addActionListener(new EuroNaZloty());		
		
		ramka = new JFrame(); 
		panel = new JPanel();
		ramka.getContentPane().add(panel);
		
		panel.setLayout(new GridLayout(3, 2));
		panel.add(label1);
		panel.add(tekst1);
		panel.add(label2);
		panel.add(tekst2);
		panel.add(przycisk1);
		
		ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ramka.pack();
		ramka.setTitle("Konwerter walut");
		ramka.setResizable(false);
		ramka.setVisible(true);
		ramka.setSize(300, 100);
	}
	
	class Wyczyść implements ActionListener
	{

		public void actionPerformed(ActionEvent e) {
			tekst1.setText("");
			tekst2.setText("");
		}
	}
	
	class ZlotyNaEuro implements ActionListener
	{

		public void actionPerformed(ActionEvent e) {
			String x = tekst1.getText();
			try {
				double a = Double.parseDouble(x);
				tekst2.setText(String.format("%.2f", Konwerter.zloty(a)));
			}
			catch (NumberFormatException e1){
				JOptionPane.showMessageDialog(null, "Nieprawidłowy format liczby", "", JOptionPane.ERROR_MESSAGE);
			}

		}
	}
	
	class EuroNaZloty implements ActionListener
	{

		public void actionPerformed(ActionEvent e) {
			String x = tekst2.getText();
			try {
				double a = Double.parseDouble(x);  
				tekst1.setText(String.format("%.2f", Konwerter.euro(a)));
			}
			catch (NumberFormatException e2) {
				 JOptionPane.showMessageDialog(null, "Nieprawidłowy format liczby", "", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}
