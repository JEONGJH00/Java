package exercise01;
import java.io.BufferedReader;
import java.util.*;

public class E1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int price = sc.nextInt();
		int count = sc.nextInt();
		int sum=0;
		for(int i=0;i<count;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			sum += a*b;
		}
		if(sum==price)
			System.out.println("Yes");
		else
			System.out.println("No");
		
	}
	
}
