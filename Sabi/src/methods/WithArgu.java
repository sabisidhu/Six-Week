package methods;

import java.util.Scanner;

public class WithArgu {
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		WithArgu obj = new WithArgu();
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		obj.add(a, b);
		obj.add(25, 40);
		
		
	}
	

}
