package algorithm;

import javax.swing.JOptionPane;

public class DuplicateElemment {
	public static void main(String[] args) {
		int a[] = new int[10];
		int i, temp;
		for (i = 0; i < 5; i++) {
			a[i] = Integer.parseInt(JOptionPane.showInputDialog("enter " + i
					+ "variable"));
		}
		temp = a[0];

		for (i = 1; i < 5; i++) {
			for(int j=1;j< 5 ;j++)

			{
				
				if (temp == a[i]) {
					temp = a[i];
				}
			}
		}
	}

}
