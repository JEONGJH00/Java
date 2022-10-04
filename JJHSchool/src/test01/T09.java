package test01;

public class T09 { //2부터 100사이 소수 구하기

	public static void main(String[] args) {
		
		int n,i;
		for(n=2 ; n<=100; n++) {
			for(i=2;i<n;i++)
				if(n%i==0)
					break;
			if(i==n)
				System.out.print(n+" ");
		}
		
	}

}
