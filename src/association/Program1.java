package association;

import java.util.HashSet;
import java.util.Scanner;
// association is nothing but relation between two separate class established by object
import java.util.Set;

class Bank
{
	private String name;
	private Set<Employee> employee;
	
	Bank(String name)
	{
		this.name = name;
	}
	
	public String getBankName()
	{
		return name;
	}
	public void setBankName(String name)
	{
		System.out.println("new name");
		this.name = name;
		System.out.println(name);
	}
	
	public Set<Employee> getEmployee()
	{
		return this.employee;
	}
	
	public void setEmployeeName(Set<Employee> employee)
	{
		System.out.println("new wmployee");
		this.employee = employee;
	}
}

class Employee
{
	String name;
	Employee(String name)
	{
		this.name = name;
	}
	public String getEmployeeName()
	{
		return this.name;
	}
}

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String bName = sc.next();
		String eName = sc.next();
		Bank b = new Bank(bName);
		Employee e = new Employee(eName);
		
		Set<Employee> emp = new HashSet<>();
		emp.add(e);
		
		b.setEmployeeName(emp);
		
		String bN = b.getBankName();
		System.out.println(bN);
		
		
		
		String eN = e.getEmployeeName();
		System.out.println(eN);
	}

}
