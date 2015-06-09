package calculator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField dipl;
	private JButton v2;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JButton button_10;
	private JButton button;
	private JButton button_11;
	boolean add=false;
	boolean sub=false;
	boolean multi=false;
	
int a;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		dipl = new JTextField();
		dipl.setBounds(113, 11, 213, 20);
		contentPane.add(dipl);
		dipl.setColumns(10);
		
		JButton v1 = new JButton("1");
		v1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dipl.setText(dipl.getText()+"1");
			}
		});
		v1.setBounds(100, 66, 63, 23);
		contentPane.add(v1);
		
		v2 = new JButton("2");
		v2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dipl.setText(dipl.getText()+"2");
			}
		});
		v2.setBounds(185, 66, 63, 23);
		contentPane.add(v2);
		
		button_1 = new JButton("3");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dipl.setText(dipl.getText()+"3");
			}
		});
		button_1.setBounds(263, 66, 63, 23);
		contentPane.add(button_1);
		
		button_2 = new JButton("+");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Integer.parseInt(dipl.getText());
				add=true;
				dipl.setText("");
			}
		});
		button_2.setBounds(338, 66, 63, 23);
		contentPane.add(button_2);
		
		button_3 = new JButton("4");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dipl.setText(dipl.getText()+"4");
			}
		});
		button_3.setBounds(100, 100, 63, 23);
		contentPane.add(button_3);
		
		button_4 = new JButton("5");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dipl.setText(dipl.getText()+"5");
			}
		});
		button_4.setBounds(185, 100, 63, 23);
		contentPane.add(button_4);
		
		button_5 = new JButton("6");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dipl.setText(dipl.getText()+"6");
			}
		});
		button_5.setBounds(263, 100, 63, 23);
		contentPane.add(button_5);
		
		button_6 = new JButton("-");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Integer.parseInt(dipl.getText());
				sub=true;
				dipl.setText("");
			}
		});
		button_6.setBounds(338, 100, 63, 23);
		contentPane.add(button_6);
		
		button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dipl.setText(dipl.getText()+"7");
			}
		});
		button_7.setBounds(100, 134, 63, 23);
		contentPane.add(button_7);
		
		button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dipl.setText(dipl.getText()+"8");
			}
		});
		button_8.setBounds(185, 134, 63, 23);
		contentPane.add(button_8);
		
		button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dipl.setText(dipl.getText()+"9");
			}
		});
		button_9.setBounds(263, 134, 63, 23);
		contentPane.add(button_9);
		
		button_10 = new JButton("*");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Integer.parseInt(dipl.getText());
				multi=true;
				dipl.setText("");
			}
		});
		button_10.setBounds(338, 134, 63, 23);
		contentPane.add(button_10);
		
		button = new JButton("0");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dipl.setText(dipl.getText()+"0");
			}
		});
		button.setBounds(185, 185, 63, 23);
		contentPane.add(button);
		
		button_11 = new JButton("=");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(add){
					dipl.setText((a+Integer.parseInt(dipl.getText()))+"");
					add=false;
				}
				if(sub){
					dipl.setText((a-Integer.parseInt(dipl.getText()))+"");
					sub=false;
				}
				if(multi){
					dipl.setText((a*Integer.parseInt(dipl.getText()))+"");
					multi=false;
				}
				
				
			}
		});
		button_11.setBounds(338, 185, 63, 23);
		contentPane.add(button_11);
	}
}
