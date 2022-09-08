package test01;

public class T1 {

	public static void main(String[] args) {
		final double LIGHT_SPEED = 3e5;		// PI는 상수이므로 final 을 붙인다. 
		double distance;
		
		distance = LIGHT_SPEED*365*24*60*60;
		System.out.println("빛이 1년동안 가는 거리 : "+distance+"Km.");
	}

}
