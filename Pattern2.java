package org.snad.patterns;

import java.util.Scanner;

public class Pattern2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows : ");
		int n = sc.nextInt();
		int str1 = 1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=str1;j++) {
				System.out.print("*");
			}
			System.out.println();
			str1++;
		}
		System.out.println("=================Reverse===============");
		int str2 = n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=str2;j++) {
				System.out.print("*");
			}
			System.out.println();
			str2--;
		}
		sc.close();
	}

}
