package Exercise1;
import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedNameSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create TreeSet from First Name array
		String[] firstNames = {"Sankar", "Sankar", "Nisha", "Joya", "Titon", "Tutul", "Biswajit", "Satyajit", 
								"Biplob", "Proloy", "Shipu", "Jiban", "Biswajit", "Joya"};
		
		SortedSet<String> tree = new TreeSet<>(Arrays.asList(firstNames));
		System.out.print("Sorted Names: ");
	    printName(tree); 
	    
	    //prompt for user input
	     System.out.printf("Enter first name: ");
	    
	    // create scanner
	      Scanner scan = new Scanner(System.in);
	      
	      //search entered first name
	      String firstName = scan.nextLine();
	      
	      boolean answer = false;
	      
	      for (String fName: firstNames){
	    	  if (fName.equals(firstName)) {
	    		  answer = true;
	    	  }
	      }
	      
	      if(answer) {
			  System.out.print("Name found");
	      }else {

			  System.out.print("Name not found");
	      }
	      
	}
	// output SortedSet using enhanced for statement
	private static void printName(SortedSet<String> names) {
		for(String fName : names) {
			System.out.printf("%s ", fName);
		}
		System.out.println();
	}

}
