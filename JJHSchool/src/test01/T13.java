package test01;

public class T13 {

	public static void main(String[] args) {
		
		String a[]= {"Clubs","Diamonds","Hearts","Spades"};
		String b[]={"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		
		for(int i=0;i<5;i++)
		{
			System.out.println(a[(int)((Math.random()*100+1)/100*4)]+"의 "+
		b[(int)((Math.random()*100+1)/100*13)]);
		}
				
	}
	
}//
