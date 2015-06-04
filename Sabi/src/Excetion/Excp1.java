package Excetion;

import javax.swing.JOptionPane;

public class Excp1 {
	public static void main(String[] args) {
		int a;
		int b[]=new int[10];
		String stt;
		
		try{
			b[20]=10;
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, " Array Bound Error ");	
		}
		
		JOptionPane.showMessageDialog(null, "Finish");
		
	}

}
