package homework1;
import java.util.Random;
public class GetUp {

	public static void main(String[] args) {
		Random rand= new Random(); // generates random number within limit(limit-1) specified
		int maxTime=24;            // 0-23
		boolean squawking;
		int currentHour = rand.nextInt(maxTime);
		System.out.println(currentHour);
		if( (currentHour < 6 ) || (currentHour > 21) ) {
			squawking=true;
			System.out.println("Get up");					
		}
		else {
			squawking=false;
			System.out.println("Parrot didn't squawk");
		}
		
	}
	
}
