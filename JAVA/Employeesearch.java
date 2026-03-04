package rifa;


import java.util.Scanner;
class Employee{
	int eNo;
	String eName;
	double eSalary;
	
	void read(Scanner sc)
	{
		System.out.print("Enter Employee Nnumber :");
		eNo=sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter Employee Name :");
		eName=sc.nextLine();
		
		System.out.print("Enter Employee Salary :");
		eSalary=sc.nextDouble();
	}
	void display()
	{
		System.out.println("Employee Number :"+eNo);
		System.out.println("Employee Number :"+eName);
		System.out.println("Employee Number :"+eSalary);
		
	}
}
public class Employeesearch {

	public static void main(String[] args) {
		
		Scanner sc=new 
		        Scanner(System.in);
		
		System.out.print("Enter number of Employees :");
		int n=sc.nextInt();
		
		Employee[]emp=new Employee[n];
		for (int i=0;i<n;i++) {
			emp[i]=new Employee();
			System.out.println("\nEnter details of Employee"+(i+1));
			emp[i].read(sc);
			
		}
		System.out.print("\nEnter Employee Number to search :");
		int searchNo=sc.nextInt();
		
		boolean found=false;
		
		for(int i=0;i<n;i++) {
			if (emp[i].eNo==searchNo)
			{
				System.out.println("\nEmployee Found :");
				emp[i].display();
				found=true;
				break;
			}
		}
		if(!found) {
			System.out.println("Employee not found :");
		}
		sc.close();
	}

}
