package com.test;

import java.util.Scanner;

public class MatrixMainDiagnolDiff {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 3x3 matrix");
		int[][] a = new int[3][3];
		for(int i=0; i<3; i++)
			for(int j=0; j<3; j++)
				a[i][j] = sc.nextInt();
		int c1 = 0, c2 = 0;
		for(int i=0; i<3; i++)
			for(int j=0; j<3; j++){
				if(i==j){
					c1+=a[i][j];
				}
				if(j==(2-i)){
					c2+=a[i][j];
				}
			}
		System.out.println("final output	:"+(c1-c2));
	}
}
