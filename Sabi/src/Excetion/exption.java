package Excetion;

import javax.swing.JOptionPane;

public class exption {
	public static void main(String[] args) {
		int a;
		a= Integer.parseInt(JOptionPane.showInputDialog("Enter the value"));
		JOptionPane.showMessageDialog(null, a/0);
		
	}

}
