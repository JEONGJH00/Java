package test01;

import java.util.Scanner;

public class T11 { // 숫자 추측 게임

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int answer = (int) (Math.random() * 100 + 1);
		int guess;
		do {
			System.out.println("숫자를 입력하세요 : ");
			guess = sc.nextInt();
			n++;
			if (guess < answer)
				System.out.println("제시한 숫자가 낮습니다.");
			if (guess > answer)
				System.out.println("제시한 숫자가 높습니다.");
		} while (guess != answer);

		System.out.println("정답입니다. 시도한 횟수는 " + n + "회 입니다.");
		sc.close();
	}

}//
