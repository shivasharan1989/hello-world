package shiv;

import java.util.Scanner;

public class codingbat {

	public static void main(String[] args) {
		int k=1;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number");
		int m=sc.nextInt();
		for(int i=m;i>=1;i--)
		{
			k=k*m;
			m=m-1;
		}
		System.out.println(k);
		}
		
		
		
	}


