package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calc extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	int temp;
	boolean add=false;
	boolean sub=false;
	boolean multi=false;
	boolean div= false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc frame = new Calc();
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
	public Calc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 427, 388);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(27, 11, 358, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+"1");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(27, 79, 65, 31);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("2");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"2");
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 13));
		button.setBounds(102, 79, 65, 31);
		contentPane.add(button);
		
		JButton button_1 = new JButton("3");
		button_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_1.setBounds(181, 79, 65, 31);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("+");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				temp=Integer.parseInt(textField.getText());
				textField.setText("");
				add=true;
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_2.setBounds(265, 79, 65, 31);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("4");
		button_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_3.setBounds(27, 131, 65, 31);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("5");
		button_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_4.setBounds(102, 131, 65, 31);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("6");
		button_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_5.setBounds(181, 131, 65, 31);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("-");
		button_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_6.setBounds(265, 131, 65, 31);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("7");
		button_7.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_7.setBounds(27, 185, 65, 31);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_8.setBounds(102, 185, 65, 31);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_9.setBounds(181, 185, 65, 31);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("*");
		button_10.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_10.setBounds(265, 185, 65, 31);
		contentPane.add(button_10);
		
		JButton button_12 = new JButton("0");
		button_12.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_12.setBounds(102, 241, 65, 31);
		contentPane.add(button_12);
		
		JButton button_14 = new JButton("/");
		button_14.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_14.setBounds(265, 241, 65, 31);
		contentPane.add(button_14);
		
		JButton button_18 = new JButton("=");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int rs;
				rs=temp+Integer.parseInt(textField.getText());
				textField.setText(""+rs);
				rs=temp-Integer.parseInt(textField.getText());
				textField.setText(""+rs);
				rs=temp*Integer.parseInt(textField.getText());
				textField.setText(""+rs);
				rs=temp/Integer.parseInt(textField.getText());
				textField.setText(""+rs);
			}
		});
		button_18.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_18.setBounds(181, 241, 65, 31);
		contentPane.add(button_18);
		
		JButton btnC = new JButton("C");
		btnC.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnC.setBounds(27, 241, 65, 31);
		contentPane.add(btnC);
	}
}
