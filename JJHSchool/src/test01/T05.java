package test01;
import java.util.Scanner;

public class T05 {

	public static void main(String[] args) {	// 짝수와 홀수 구별하기 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하시오: ");
		int num = sc.nextInt();
		
		if(num%2==0)
			System.out.println("입력된 정수는 짝수입니다.");
		else
			System.out.println("입력된 정수는 홀수입니다.");
		
	}

}//
