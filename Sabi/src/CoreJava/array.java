package CoreJava;

import javax.swing.JOptionPane;

public class array {
	public static void main(String[] args) {
		int a[] = new int[10];
		int i;
		int b;
		for(i=1;i<10;i++){
			b=Integer.parseInt(JOptionPane.showInputDialog("Enter Elements"));
			
		}
		
		for(i=1;i<=10;i++){
		System.out.println("Array "+i+" = "+a[i]);
		}
	}

}
