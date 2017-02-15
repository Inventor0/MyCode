package Ñî»ÔÈý½Ç;

import java.util.Scanner;

public class TextTriangle {
	public static void main(String[] args) {
		int n, i, j, a[][];
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		a = new int[n][n + 2];
		for (i = 0; i < n; i++)
			for (j = 0; j < n + 2; j++)
				a[i][j] = 0;
		for (i = 0; i < n; i++) {
			if (i == 0) {
				a[0][1] = 1;
				System.out.print(1);
			} else {
				for (j = 1; j <= i + 1; j++) {
					a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
					System.out.print(a[i][j]+"  ");

				}
			}
			System.out.println();
		}

	}

}
