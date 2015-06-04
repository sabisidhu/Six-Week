package methods;

import java.util.Scanner;

public class withRetrnAndArgu {
	public int choice(){
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		int a=sc.nextInt();
		return a;
		
	}
	public int add(int a,int b)
	{
	return(a+b);
	}
	public static void main(String[] args) {
		int a;
		int b;
		withRetrnAndArgu obj = new  withRetrnAndArgu();
		b=obj.choice();
		if(b==1){
			
		}
		a=obj.add(10, 20);
		System.out.println(a+10);
		
	}

}
