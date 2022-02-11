
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;  
import java.util.Scanner;

public class DisplayGreet {
	
 	public static void main(String[] args) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		System.out.printf("Current date and time %s \n", dtf.format(now));
		String str=dtf.format(now);
		
//		String type= dtf.getClass().getName();
//		System.out.println(type);
		
		String[] arrOfStr = str.split(":", 3);
		int[] time= new int[3];
		int cnt=0;
		 for (String a : arrOfStr) {
			 
	            time[cnt]=Integer.valueOf(a);
//          		System.out.println(time[cnt]);
	            cnt++;
	    }		 
		
		if (time[0] >= 5 && time[0] <= 11)	{
			System.out.println ("Good Morning");	
		}
		else {
			if (time[0] >= 12 && time[0] <= 16) {
				System.out.println( "Good Noon"); }
			else	{
				System.out.println( "Good Evening"); }
		   } 
		
	} // main()
	
}// class DisplayGreet 
	