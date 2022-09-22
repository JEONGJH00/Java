package test01;

import java.util.Scanner;

public class T12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 항의 개수 : ");
		int n = sc.nextInt();
		
		int a1=0;
		int a2=1;
		int a3;
		
		System.out.println(a1);
		System.out.println(a2);
		
		for(int i=1;i<=n-2;i++) {
			a3=a1+a2;
			System.out.println(a3);
			a1=a2;
			a2=a3;
		}	
	}
}
//

