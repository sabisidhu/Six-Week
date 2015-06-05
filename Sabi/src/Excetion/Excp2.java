package Excetion;

import javax.swing.JOptionPane;

public class Excp2 {
	public static void main(String[] args) {

		int a = 2;
		System.out.println("hello");
		try{

		int b = a / 1;
		}catch(Exception e){
			System.err.println("Error");
		}
		System.out.println("Finish");


	}
}
