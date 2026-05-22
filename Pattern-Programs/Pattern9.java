package org.snad.patterns;

import java.util.Scanner;

public class Pattern9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows :");
		int n=sc.nextInt();
		int str=1;
		int spc=n-2;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=str;j++) {
				System.out.print("*");
			}
			for(int k=1;k<=spc;k++) {
				System.out.print(" ");
			}
			for(int l=1;l<=str;l++) {
				System.out.print("*");
			}
			if(i<n/2) {
				str++;
				spc=spc-2;
			}else {
				str--;
				spc=spc+2;
			}
			System.out.println();
		}
		sc.close();
	}

}
