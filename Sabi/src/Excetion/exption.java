package Excetion;

import javax.swing.JOptionPane;

public class exption {
	public static void main(String[] args) {
		int a;
		int b[]=new int[10];
		String stt;
		
		try{
			a= Integer.parseInt(JOptionPane.showInputDialog("Enter the value"));
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Please Enter Numeric Value ");	
		}
		
		JOptionPane.showMessageDialog(null, "Finish");
		
	}

}
