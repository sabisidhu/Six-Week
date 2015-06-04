package CoreJava;

import javax.swing.JOptionPane;

public class GreatestElement {
	public static void main(String[] args) {
		int a[] = new int[10];
		int i;
		
		int temp;
		for(i=0;i<=9;i++){
			a[i]=Integer.parseInt(JOptionPane.showInputDialog("Enter Elements"));
			
		}
		temp=a[0];
		
		for(i=1;i<=9;i++){
			
			if(temp<a[i]){
				temp=a[i];
			}
		}
		JOptionPane.showMessageDialog(null, "Greatest Element = "+temp);
	}

}
