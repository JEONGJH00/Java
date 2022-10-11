package test01;

import java.util.Scanner;

public class T02 {

	public static void main(String[] args) {

		// 사용자로부터 입력받은 두 수 더하기
		Scanner sc = new Scanner(System.in);
		int x, y, sum;

		System.out.println("첫번째 숫자를 입력하세요 : ");
		x = sc.nextInt();

		System.out.println("두번째 숫자를 입력하세요 : ");
		y = sc.nextInt();

		sum = x + y;
		System.out.println("두 수의 합은 " + sum + " 입니다.");

		sc.close();
	}

}
