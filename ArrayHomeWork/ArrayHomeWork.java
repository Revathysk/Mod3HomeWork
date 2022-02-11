package ArrayHomeWork;

import java.util.ArrayList;

public class ArrayHomeWork {

	public static void main(String[] args) {
		ArrayList <String> sedan = new ArrayList<String>();
		sedan.add("Accord");
		sedan.add("Yaris");
	     
	    ArrayList <String> suv = new ArrayList<String>();
	    suv.add("CRV");
	    suv.add("RAV4");
	    suv.add("HighLander");
	    System.out.println("sedan: "+sedan);
	    System.out.println("suv: "+suv);
	    ArrayList <String> cars = new ArrayList<String>();
	    cars.addAll(sedan);
	    cars.addAll(suv);
	    System.out.println("Combined list in Car Array:"+ cars);
	    	    
	    ArrayList<Integer> numbers= new ArrayList<>();
	    numbers.add(100);
	    numbers.add(900);
	    numbers.add(400);
	    numbers.add(600);
	    System.out.println(numbers);
	    
	    ArrayList<Character> greet= new ArrayList<Character>();
	    greet.add('W');
	    greet.add('e');
	    greet.add('l');
	    greet.add('c');
	    greet.add('o');
	    greet.add('m');
	    greet.add('e');
	    for(char index:greet){
	    	System.out.print(index);
	    }
	    
	    //cloning array
	    ArrayList <String> carsClone = (ArrayList<String>) cars.clone();
	    System.out.println(carsClone);  
	     
	    carsClone.add("Honda City");
	    System.out.println(carsClone);  

	}

}
