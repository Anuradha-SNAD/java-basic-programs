package org.snad.numbers;

import java.util.Scanner;

public class Largest {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the 3 numbers");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		
		if(n1>n2 && n1>n3) {
			System.out.println(n1);
		}else if(n2>n1 && n2>n3){
			System.out.println(n2);
		}else{
			System.out.println(n3);
		}
		sc.close();
	}

}
