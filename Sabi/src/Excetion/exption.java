package Excetion;

import javax.swing.JOptionPane;

public class exption {
	public static void main(String[] args) {
		int a;
		String stt;
		
		try{
			a= Integer.parseInt(JOptionPane.showInputDialog("Enter the value"));
			JOptionPane.showMessageDialog(null, a);
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Please Enter Numeric Value ");	
		}
		
		JOptionPane.showMessageDialog(null, "Finish");
		
	}

}
