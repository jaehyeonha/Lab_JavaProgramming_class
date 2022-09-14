import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		String firstName;
		String lastName;
		double monthlySalary;
		
		System.out.print("Enter first name: ");
		firstName = input.next();
		System.out.print("Enter last name: ");
		lastName = input.next();
		System.out.print("Enter monthly salary: ");
		monthlySalary = input.nextDouble();
		Employee employee1 = new Employee(firstName, lastName, monthlySalary);
		
		System.out.printf("\n");
		
		System.out.print("Enter first name: ");
		if(input.hasNextLine()) {
			input.nextLine();
		}
		
		firstName = input.nextLine();
		System.out.print("Enter last name: ");
		lastName = input.next();
		System.out.print("Enter monthly salary: ");
		monthlySalary = input.nextDouble();
		Employee employee2 = new Employee(firstName, lastName, monthlySalary);
		
		System.out.printf("\n");
		
		System.out.printf("Employee 1: %s %s; Yearly Salary: %.2f\n",employee1.getfirstName(),employee1.getlastName(),employee1.getmonthlySalary()*12);
		System.out.printf("Employee 2: %s %s; Yearly Salary: %.2f\n",employee2.getfirstName(),employee2.getlastName(),employee2.getmonthlySalary()*12);
		
		System.out.print("\nIncreasing employee salaries by 10%\n");
		
		System.out.printf("Employee 1: %s %s; Yearly Salary: %.2f\n",employee1.getfirstName(),employee1.getlastName(),employee1.getmonthlySalary()*12*1.1);
		System.out.printf("Employee 2: %s %s; Yearly Salary: %.2f\n",employee2.getfirstName(),employee2.getlastName(),employee2.getmonthlySalary()*12*1.1);
	}
}