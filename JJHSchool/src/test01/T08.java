package test01;

public class T08 {

	public static void main(String[] args) {

		/*
		 * 계단식
		 * for (int i = 1; i < 6; i++)
		 * {
		 * for (int k = 0; k < i; k++)
		 * {
		 * System.out.print("*");
		 * }
		 * System.out.println();
		 * }
		 */

		for (int i = 1; i <= 5; i++) {
			for (int k = 1; k <= 5 - i; k++)
				System.out.print(" ");
			for (int j = 1; j <= 2 * i - 1; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}//
