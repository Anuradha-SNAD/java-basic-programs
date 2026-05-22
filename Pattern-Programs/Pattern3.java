package org.snad.patterns;

import java.util.Scanner;

public class Pattern3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows : ");
		int n= sc.nextInt();
		int str=1;
		int spc=n-1;
		for(int i =1; i<=n ;i++) {
			for(int j=1;j<=spc;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=str;k++) {
				System.out.print("*");
			}
			System.out.println();
			str+=2;
			spc--;
		}
		sc.close();
	}

}
