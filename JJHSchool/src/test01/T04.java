package test01;

import java.util.Scanner;

public class T04 {

	public static void main(String[] args) {

		// 섭씨-화씨 온도 변환
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 화씨->섭씨" + '\n' + "2. 섭씨->화씨");
		System.out.println("번호를 선택하시오: ");
		int num = sc.nextInt();

		if (num == 1) {
			System.out.println("화씨온도를 입력하시오: ");
			double f = sc.nextDouble();
			double c_temp = (f - 32) * 5 / 9;

			System.out.println("섭씨온도는 " + c_temp);
		}

		else {
			System.out.println("섭씨온도를 입력하시오: ");
			double c = sc.nextDouble();
			double f_temp = c * 9 / 5 + 32;

			System.out.println("화씨온도는 " + f_temp);

		}
		sc.close();

	}

}//
