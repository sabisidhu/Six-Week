package Excetion;

import javax.swing.JOptionPane;

public class Excp2 {
	public static void main(String[] args) {

		int a = 2;

		try {
int b=a/0;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Can not Divide by  Zero ");
		}

		JOptionPane.showMessageDialog(null, "Finish");

	}
}
