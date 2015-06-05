package Excetion;

import javax.swing.JOptionPane;

public class Excp1 {
	public static void main(String[] args) {
		int a;
		int b[]=new int[10];
		String stt;
		
		try{
			b[9]=10;
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, " Array Bound Error "+e);	
		}
		
		JOptionPane.showMessageDialog(null, "Finish");
		
	}

}
