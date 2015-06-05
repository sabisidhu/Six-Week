package CoreJava;

import java.util.Scanner;

public class break1 {
	public static void main(String[] args) {
		int ch;
		Scanner sc = new Scanner( System.in);
	
		while(true){
			System.out.println("Enter choice \n0. Exit");
			ch=sc.nextInt();
			System.out.println(ch);
			if(ch==0){
				break;
			}
			
		}
		
	}

}
