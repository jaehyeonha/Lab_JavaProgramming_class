
public class Employee {

	private String firstName;
	private String lastName;
	private double monthlySalary;
	
	public Employee(String first, String last, double month){
		firstName = first;
		lastName = last;
		monthlySalary = month;
	}
	
	public void setfirstName (String firstName){
		this.firstName = firstName;
	}
	
	public void setlastName (String lastName){
		this.lastName = lastName;
	}
	
	public void setmonthlySalary(double monthlySalary){		
		if(monthlySalary>0.0){
			this.monthlySalary = monthlySalary;
		}
	}
	
	public String getfirstName(){
		return this.firstName;
	}

	public String getlastName(){
		return this.lastName;
	}
	
	public double getmonthlySalary(){
		return this.monthlySalary;
	}
}

