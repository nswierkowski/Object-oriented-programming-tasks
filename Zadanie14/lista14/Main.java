package lista14;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Main {

	JFrame ramka;
	JPanel panel1;
	JPanel panel2;
	JTextField tekst1;
	JLabel label1;
	JLabel label2;
	JLabel label3;
	JLabel label4;
	JLabel label5;
	JLabel label6;
	JLabel label7;
	JTextField tekst2;
	JTextField tekst3;
	JTextField tekst4;
	JTextField tekst5;
	JTextField tekst6;
	JTextField tekst7;
	JButton przycisk1;
	JButton przycisk2;
	JButton przycisk3;
	JButton przycisk4;
	JButton przycisk5;
	JButton przycisk6;
	JFrame ramka2;
	Samochody s;
	
	public static void main(String[] args) {
		Main m = new Main();
		m.s = new Samochody();
		m.s.dodajNowyAutoCiężarowe("Renault", 100000, 421, false, "T", 4.0, false);
		m.s.dodajNowyAutoOsobowe("Fiat", 50000, 123, false, "Focus", 1.8);
		m.s.dodajNowyAutoOsobowe("Opel", 24400, 234, true, "Astra", 1.8);
		m.s.dodajNowyAutoCiężarowe("Renault", 80000, 432, true, "Megane", 4.5, true);

		m.rysuj();
	}

	public void rysuj() {
		ramka = new JFrame();
		panel1 = new JPanel();
		tekst1 = new JTextField(50);
		przycisk1 = new JButton("Dodaj nowe auto osobowe");
		przycisk2 = new JButton("Dodaj nowe auto ciężarowe");
		przycisk3 = new JButton("Wyświetl samochody");
		przycisk4 = new JButton("Sortuj");
		przycisk5 = new JButton("Pokaż auto o największym zużyciu");
		przycisk6 = new JButton("Pokaż auto o największym zużyciu Paliwa");

		
		ramka.getContentPane().add(panel1);
		panel1.setLayout(new GridLayout(6, 1));
		przycisk1.addActionListener(new dodajAutoOsobowe());
		przycisk2.addActionListener(new dodajAutoCiezarowe());
		przycisk3.addActionListener(new Wyswietl());
		przycisk4.addActionListener(new Sortuj());
		przycisk5.addActionListener(new MaxZuzycie());
		przycisk6.addActionListener(new MaxZuzyciePaliwa());
		
		panel1.add(przycisk1);
		panel1.add(przycisk2);
		panel1.add(przycisk3);
		panel1.add(przycisk4);
		panel1.add(przycisk5);
		panel1.add(przycisk6);
		
		ramka.setTitle("Samochody");
		ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ramka.pack();
		ramka.setResizable(false);
		ramka.setVisible(true);
		ramka.setSize(400, 200);
	}
	
	class dodajAutoOsobowe implements ActionListener
	{

		public void actionPerformed(ActionEvent e) {	

			label1 = new JLabel("Marka: ");
			label2 = new JLabel("Liczba kilometrów: ");
			label3 = new JLabel("Numer nadwozia: ");
			label4 = new JLabel("Diesel: ");
			label5 = new JLabel("Model: ");
			label6 = new JLabel("Zużycie: ");
			
			tekst1 = new JTextField(10);
			tekst2 = new JTextField(10);
			tekst3 = new JTextField(10);
			tekst4 = new JTextField(10);
			tekst5 = new JTextField(10);
			tekst6 = new JTextField(10);
			
			przycisk3 = new JButton("Dodaj samochód");
			przycisk3.addActionListener(new StworzSamochod());
			przycisk4 = new JButton("Wróc");
			przycisk4.addActionListener(new Wroc());
			
			ramka2 = new JFrame();
			panel2 = new JPanel();
			panel2.setLayout(new GridLayout(7, 2));
			
			panel2.add(label1);
			panel2.add(tekst1);
			panel2.add(label2);
			panel2.add(tekst2);
			panel2.add(label3);
			panel2.add(tekst3);
			panel2.add(label4);
			panel2.add(tekst4);
			panel2.add(label5);
			panel2.add(tekst5);
			panel2.add(label6);
			panel2.add(tekst6);
			panel2.add(przycisk3);
			panel2.add(przycisk4);
			
			ramka2.add(panel2);
			
			ramka2.setTitle("Dodaj auto osobowe");
			ramka2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			ramka2.pack();
			ramka2.setResizable(false);
			ramka2.setVisible(true);
			ramka2.setSize(400, 200);
		}
		
		class StworzSamochod implements ActionListener{
			public void actionPerformed(ActionEvent arg0) {
				try {
					String s1 = tekst1.getText();
					int s2 = Integer.parseInt(tekst2.getText());
					int s3 = Integer.parseInt(tekst3.getText());
					boolean s4 = Boolean.parseBoolean(tekst4.getText());
					String s5 = tekst5.getText();
					double s6 = Double.parseDouble(tekst6.getText());
					s.dodajNowyAutoOsobowe(s1, s2, s3, s4, s5, s6);
					tekst1.setText("");
					tekst2.setText("");
					tekst3.setText("");
					tekst4.setText("");
					tekst5.setText("");
					tekst6.setText("");
				}
				catch (NumberFormatException e1){
					JOptionPane.showMessageDialog(null, "Nieprawidłowy format liczby", "", JOptionPane.ERROR_MESSAGE);
				}
			}
		}
		
		class Wroc implements ActionListener{
			public void actionPerformed(ActionEvent arg0) {
				ramka2.dispose();
			}
		}
	}
	
	class dodajAutoCiezarowe implements ActionListener
	{

		public void actionPerformed(ActionEvent e) {
			label1 = new JLabel("Marka: ");
			label2 = new JLabel("Liczba kilometrów: ");
			label3 = new JLabel("Numer nadwozia: ");
			label4 = new JLabel("Diesel: ");
			label5 = new JLabel("Model: ");
			label6 = new JLabel("Zużycie: ");
			label7 = new JLabel("Kratka: ");
			
			tekst1 = new JTextField(10);
			tekst2 = new JTextField(10);
			tekst3 = new JTextField(10);
			tekst4 = new JTextField(10);
			tekst5 = new JTextField(10);
			tekst6 = new JTextField(10);
			tekst7 = new JTextField(10);
			
			przycisk3 = new JButton("Dodaj samochód");
			przycisk3.addActionListener(new StworzSamochod());
			przycisk4 = new JButton("Wróc");
			przycisk4.addActionListener(new Wroc());
			
			ramka2 = new JFrame();
			panel2 = new JPanel();
			panel2.setLayout(new GridLayout(8, 2));
			
			panel2.add(label1);
			panel2.add(tekst1);
			panel2.add(label2);
			panel2.add(tekst2);
			panel2.add(label3);
			panel2.add(tekst3);
			panel2.add(label4);
			panel2.add(tekst4);
			panel2.add(label5);
			panel2.add(tekst5);
			panel2.add(label6);
			panel2.add(tekst6);
			panel2.add(label7);
			panel2.add(tekst7);
			panel2.add(przycisk3);
			panel2.add(przycisk4);
			
			ramka2.add(panel2);
			
			ramka2.setTitle("Dodaj auto ciężarowe");
			ramka2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			ramka2.pack();
			ramka2.setResizable(false);
			ramka2.setVisible(true);
			ramka2.setSize(400, 200);
		}
		
		class StworzSamochod implements ActionListener{
			public void actionPerformed(ActionEvent arg0) {
				try {
					String s1 = tekst1.getText();
					int s2 = Integer.parseInt(tekst2.getText());
					int s3 = Integer.parseInt(tekst3.getText());
					boolean s4 = Boolean.parseBoolean(tekst4.getText());
					String s5 = tekst5.getText();
					double s6 = Double.parseDouble(tekst6.getText());
					boolean s7 = Boolean.parseBoolean(tekst7.getText());
					s.dodajNowyAutoCiężarowe(s1, s2, s3, s4, s5, s6, s7);
					tekst1.setText("");
					tekst2.setText("");
					tekst3.setText("");
					tekst4.setText("");
					tekst5.setText("");
					tekst6.setText("");
					tekst7.setText("");
				}
				catch (NumberFormatException e1){
					JOptionPane.showMessageDialog(null, "Nieprawidłowy format liczby", "", JOptionPane.ERROR_MESSAGE);
				}
			}
		}
		
		class Wroc implements ActionListener{
			public void actionPerformed(ActionEvent arg0) {
				ramka2.dispose();
			}
		}
	}
	
	class Wyswietl implements ActionListener{

		public void actionPerformed(ActionEvent arg0) {
			ramka2 = new JFrame();
			panel2 = new JPanel();
			panel2.setLayout(new GridLayout(s.getSamochody().size() + 1, 1));
			ramka2.add(panel2);
			przycisk3 = new JButton("Wróć");
			przycisk3.addActionListener(new Wroc());
			for(Auto a : s.getSamochody()) {
				JTextField t = new JTextField(10);
				t.setText(a.toString());
				panel2.add(t);
			}
			
			panel2.add(przycisk3);
			ramka2.setTitle("Samochody: ");
			ramka2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			ramka2.pack();
			ramka2.setResizable(false);
			ramka2.setVisible(true);
			ramka2.setSize(800, 300);
		}
		
		class Wroc implements ActionListener{
			public void actionPerformed(ActionEvent arg0) {
				ramka2.dispose();
			}
		}
	}
	
	class Sortuj implements ActionListener{

		public void actionPerformed(ActionEvent arg0) {
			ramka2 = new JFrame();
			panel2 = new JPanel();
			panel2.setLayout(new GridLayout(4, 1));
			ramka2.add(panel2);
			przycisk1 = new JButton("Sortuj według marek");
			przycisk2 = new JButton("Sortuj weług liczby kilometrów");
			przycisk3 = new JButton("Sortuj natywnie");
			przycisk4 = new JButton("Wróć");
			przycisk1.addActionListener(new SortujWgMarek());
			przycisk2.addActionListener(new SortujWgLK());
			przycisk3.addActionListener(new SortujNatywnie());
			przycisk4.addActionListener(new Wroc());
			
			panel2.add(przycisk1);
			panel2.add(przycisk2);
			panel2.add(przycisk3);
			panel2.add(przycisk4);
			ramka2.setTitle("Sortuj: ");
			ramka2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			ramka2.pack();
			ramka2.setResizable(false);
			ramka2.setVisible(true);
			ramka2.setSize(400, 200);
		}
		
		class SortujWgMarek implements ActionListener{
			public void actionPerformed(ActionEvent arg0) {
				s.komperatorSortujWgMarek();
				s.sortuj();
			}
		}
		
		class SortujWgLK implements ActionListener{
			public void actionPerformed(ActionEvent arg0) {
				s.komperatorSortujWgLK();
				s.sortuj();
			}
		}
		
		class SortujNatywnie implements ActionListener{
			public void actionPerformed(ActionEvent arg0) {
				s.komperatorSortuj();
				s.sortuj();
			}
		}
		
		class Wroc implements ActionListener{
			public void actionPerformed(ActionEvent arg0) {
				ramka2.dispose();
			}
		}
	}
	
	class MaxZuzycie implements ActionListener{

		public void actionPerformed(ActionEvent arg0) {
			ramka2 = new JFrame();
			panel2 = new JPanel();
			panel2.setLayout(new GridLayout(2, 1));
			ramka2.add(panel2);
			
			JTextField t = new JTextField(10);
			Auto a = s.wyswietlNajwiekszeZuzycie();
			int i = 0;
			int j = -1;
			for(Auto a1 : s.getSamochody()) {
				if(a1.equals(a)) j = i;
				i++;
			}
			t.setText(a.toString() + " index " + j);
			przycisk3 = new JButton("Wróć");
			przycisk3.addActionListener(new Wroc());
			
			panel2.add(t);
			panel2.add(przycisk3);
			ramka2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			ramka2.pack();
			ramka2.setResizable(false);
			ramka2.setVisible(true);
			ramka2.setSize(800, 100);
		}
		
		class Wroc implements ActionListener{
			public void actionPerformed(ActionEvent arg0) {
				ramka2.dispose();
			}
		}
	}
	
	class MaxZuzyciePaliwa implements ActionListener{

		public void actionPerformed(ActionEvent arg0) {
			ramka2 = new JFrame();
			panel2 = new JPanel();
			panel2.setLayout(new GridLayout(2, 1));
			ramka2.add(panel2);
			
			JTextField t = new JTextField(10);
			Auto a = s.wyswietlNajwiekszeZuzyciePaliwa();
			int i = 0;
			int j = -1;
			for(Auto a1 : s.getSamochody()) {
				if(a1.equals(a)) j = i;
				i++;
			}
			t.setText(a.toString() + " index " + j);
			przycisk3 = new JButton("Wróć");
			przycisk3.addActionListener(new Wroc());
			
			panel2.add(t);
			panel2.add(przycisk3);
			ramka2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			ramka2.pack();
			ramka2.setResizable(false);
			ramka2.setVisible(true);
			ramka2.setSize(800, 100);
		}
		
		class Wroc implements ActionListener{
			public void actionPerformed(ActionEvent arg0) {
				ramka2.dispose();
			}
		}
	}
}
