package yemekekle;

import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

public class yemekler {

	private JFrame frame;
	private String text;
	private JLabel l1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					yemekler window = new yemekler();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public yemekler() {
		initialize();
	}
	
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 578, 372);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 21, 184, 113);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u00C7orbalar");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Yu Gothic", Font.BOLD, 13));
		lblNewLabel.setBounds(6, 0, 67, 23);
		panel.add(lblNewLabel);
		
		JRadioButton cmer = new JRadioButton("Mercimek   5TL");
		cmer.setBounds(3, 31, 130, 23);
		panel.add(cmer);
		
		
		JRadioButton cezo = new JRadioButton("Ezogelin      4TL");
		cezo.setBounds(3, 57, 119, 23);
		panel.add(cezo);
		
		
		
		JRadioButton cdom = new JRadioButton("Domates    4TL");
		cdom.setBounds(3, 83, 109, 23);
		panel.add(cdom);
		
		ButtonGroup group = new ButtonGroup();
        group.add(cmer);
        group.add(cezo);
        group.add(cdom);
		
		    
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 145, 184, 113);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Yemekler");
		lblNewLabel_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_1.setFont(new Font("Yu Gothic", Font.BOLD, 13));
		lblNewLabel_1.setBounds(10, 0, 73, 24);
		panel_1.add(lblNewLabel_1);	
		
		JCheckBox ytas = new JCheckBox("Tas Kebap  15TL");
		ytas.setBounds(10, 31, 122, 23);
		panel_1.add(ytas);
		
		JCheckBox ytav = new JCheckBox("Tavuk    12TL");
		ytav.setBounds(10, 57, 116, 23);
		panel_1.add(ytav);
		
		JCheckBox ylah = new JCheckBox("Lahmancun   6TL");
		ylah.setBounds(10, 83, 141, 23);
		panel_1.add(ylah);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(231, 21, 156, 113);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("\u0130\u00E7ecekler");
		lblNewLabel_2.setForeground(new Color(0, 0, 255));
		lblNewLabel_2.setFont(new Font("Yu Gothic", Font.BOLD, 13));
		lblNewLabel_2.setBounds(10, 0, 66, 22);
		panel_2.add(lblNewLabel_2);
		
		JCheckBox iayr = new JCheckBox("Ayran    2TL");
		iayr.setBounds(6, 31, 110, 23);
		panel_2.add(iayr);
		
		JCheckBox isod = new JCheckBox("Soda      3TL");
		isod.setBounds(6, 57, 110, 23);
		panel_2.add(isod);
		
		JCheckBox isu = new JCheckBox("Su          1TL");
		isu.setBounds(6, 82, 110, 23);
		panel_2.add(isu);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(231, 145, 156, 113);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Tatl\u0131lar");
		lblNewLabel_3.setForeground(new Color(0, 0, 255));
		lblNewLabel_3.setFont(new Font("Yu Gothic", Font.BOLD, 13));
		lblNewLabel_3.setBounds(6, 0, 60, 24);
		panel_3.add(lblNewLabel_3);
		
		JRadioButton tkun = new JRadioButton("K\u00FCnefe    8TL");
		tkun.setBounds(0, 31, 109, 23);
		panel_3.add(tkun);
		
		JRadioButton tbak = new JRadioButton("Baklava    6TL");
		tbak.setBounds(0, 57, 109, 23);
		panel_3.add(tbak);
		
		JRadioButton ttir = new JRadioButton("Tirli\u00E7e     5TL");
		ttir.setBounds(0, 83, 109, 23);
		panel_3.add(ttir);
		
		ButtonGroup group_1 = new ButtonGroup();
        group_1.add(tkun);
        group_1.add(tbak);
        group_1.add(ttir);
		
		
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(30, 144, 255));
		panel_4.setBounds(407, 21, 145, 237);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_11 = new JLabel("Afiyet Olsun");
		lblNewLabel_11.setFont(new Font("Tw Cen MT", Font.BOLD, 16));
		lblNewLabel_11.setForeground(new Color(255, 255, 0));
		lblNewLabel_11.setBounds(31, 212, 97, 25);
		panel_4.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Resturant");
		lblNewLabel_12.setFont(new Font("Yu Gothic Medium", Font.BOLD, 14));
		lblNewLabel_12.setForeground(new Color(255, 255, 255));
		lblNewLabel_12.setBounds(42, 6, 100, 25);
		panel_4.add(lblNewLabel_12);
		
		JTextPane cikisepan = new JTextPane();
		cikisepan.setBounds(0, 31, 145, 180);
		panel_4.add(cikisepan);
		
		JButton btnNewButton = new JButton("Hesapla");
		btnNewButton.setBackground(new Color(211, 211, 211));
		btnNewButton.setForeground(new Color(0, 0, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				float toplam=0;
				String text="";
			
				if (cezo.isSelected()) {
					toplam+=4;
					text+="Ezogelin : 4TL\n";
				}
				  if (cmer.isSelected()) {
					  toplam+=5;
					  text+="Mercimek : 5TL\n";
				}
			  if (cdom.isSelected()) {
				  toplam+=4;
				  text+="Domates : 4TL\n";
				}
			  if (tkun.isSelected()) {
				  toplam+=8;
				  text+="Künefe : 8TL\n";
			    }
			  if (tbak.isSelected()) {
				  toplam+=6;
				  text+="Baklava : 6TL\n";
				}
			  if (ttir.isSelected()) {
				  toplam+=5;
				  text+="Tirliçe : 5TL\n";
				}
			  if (ytas.isSelected()==true) {
				  toplam+=15;
				  text+="Tas Kebap : 15TL\n";
				}
			  if (ytav.isSelected()==true) {
				  toplam+=12;
				  text+="Tavuk Kanat : 12TL\n";
				}
			  if (ylah.isSelected()==true) {
				  toplam+=10;
				  text+="Lahmancun : 10TL\n";
				}
			  if (iayr.isSelected()==true) {
				  toplam+=2;
				  text+="Ayran : 2TL\n";
				}
			  if (isod.isSelected()==true) {
				  toplam+=3;
				  text+="Soda : 3TL\n";
				}
			  if (isu.isSelected()==true) {
				  toplam+=1;
				  text+="Su : 1TL\n";
				}
			  
			  text+="--------------\n";
			 cikisepan.setText(text+"Toplam : "+toplam);
			}
			
		});
		btnNewButton.setBounds(163, 269, 103, 32);
		frame.getContentPane().add(btnNewButton);
	}
}
