package test01;

public class T03 {

	public static void main(String[] args) {
		double area1 = 2*3.141592*20*20;
		double area2 = 3.141592*30*30;
		System.out.println("20cm 피자 면적= "+area1);
		System.out.println("30cm 피자 면적= "+area2);
		System.out.println((area1 > area2)?"20cm 피자 면적":"30cm 피자 면적");
	}

}//