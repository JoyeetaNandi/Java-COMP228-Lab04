package Exercise3;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee>{
	@Override
	   public int compare(Employee salary1, Employee salary2) {
		
	      int salaryDifference = salary1.getSalary() - salary2.getSalary();
	      
	      return salaryDifference; 
	} // end override method	

}// end class
