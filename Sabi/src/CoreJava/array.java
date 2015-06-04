package CoreJava;

import javax.swing.JOptionPane;

public class array {
	public static void main(String[] args) {
		int a[] = new int[10];
		int i;
		for(i=1;i<=9;i++){
			a[i]=Integer.parseInt(JOptionPane.showInputDialog("Enter Elements"));
			
		}
		
		for(i=1;i<=9;i++){
		System.out.println("Array "+i+" = "+a[i]);
		}
	}

}
