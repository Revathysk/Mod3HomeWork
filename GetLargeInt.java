import java.util.Scanner;

public class GetLargeInt {

	public static void main(String[] args) {
		// Enter two integer and get large integer 
		Scanner myObj1 = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter First integer");

	    int firstNum = myObj1.nextInt();  // Read  integer on next line
	    System.out.println("first Integer: \n " + firstNum);  // Output user input
	    Scanner myObj2 = new Scanner(System.in); 
	     
	    int secondNum = myObj2.nextInt();  // Read  integer on next line
	    System.out.println("Second Integer: \n" + secondNum);  // Output user input
	    
	    if ( firstNum > secondNum) {
	    	System.out.println("Largest of integer: "+ firstNum);  }
	    else {
	    	System.out.println("Largest of integer: "+ secondNum);	}

	}

}
