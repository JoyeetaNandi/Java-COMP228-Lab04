package Exercise3;

public class Employee {
	// instance variables

		private String name;		
		private int salary;		

		// method that returns the Name and set the name

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		// method that gets and sets the Salary 

		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		
		// Constructor with all data members

		public Employee(String name,  int salary) {
			
			//if (name == "")
				//System.out.println("Enter First Name!\n");
			//else
				this.name = name;		

			this.salary = salary;

		}
		
		@Override
		public String toString() {
			return String.format("Name: %s\nSalary :$%d\n",
					this.getName(), this.getSalary());
		}

} //end class
