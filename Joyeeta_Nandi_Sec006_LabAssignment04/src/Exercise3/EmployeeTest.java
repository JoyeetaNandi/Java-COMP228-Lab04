package Exercise3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeTest {

	public static void main(String[] args) {
		List<Employee> employee = new ArrayList<>(); // create List

		employee.add(new Employee("Shreya", 2150));
		employee.add(new Employee("Biplob", 250));
		employee.add(new Employee("Deb", 2500));      
			      
	      // output List elements
	      System.out.printf("Unsorted Employee Array:%n%s%n", employee);

	      // sort in order using a comparator          
	      Collections.sort(employee, new SalaryComparator());

	      // output List elements
	      System.out.printf("Sorted Employee list elements:%n%s%n", employee);
	      
	} // end main method

} //end class
