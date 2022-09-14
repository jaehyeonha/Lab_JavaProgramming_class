import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args){
		Employee employee1 = new Employee("Bob","Jones",34500.00);
		Employee employee2 = new Employee("Susan","Baker",37809.00);
		
		System.out.printf("Employee 1: %s %s; Yearly Salary: %.2f\n",employee1.getfirstName(),employee1.getlastName(),employee1.getmonthlySalary());
		System.out.printf("Employee 2: %s %s; Yearly Salary: %.2f\n",employee2.getfirstName(),employee2.getlastName(),employee2.getmonthlySalary());
		
		System.out.print("\nIncreasing employee salaries by 10%\n");
		
		System.out.printf("Employee 1: %s %s; Yearly Salary: %.2f\n",employee1.getfirstName(),employee1.getlastName(),employee1.getmonthlySalary()*1.1);
		System.out.printf("Employee 2: %s %s; Yearly Salary: %.2f\n",employee2.getfirstName(),employee2.getlastName(),employee2.getmonthlySalary()*1.1);
	}
}