package test01;

import java.util.Scanner;

public class T07 {	// case문을 이용하여 피자 가격을 출력


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("피자 종류를 입력하시오 : ");
		
		String model = sc.next();
		int price =0;
		
		switch(model) {
		case "콤비네이션" : price = 20000; break;
		}
		
		System.out.println("가격은 "+price+"원 입니다.");
	}

}
