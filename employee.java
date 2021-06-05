
import java.util.Scanner;
public class employee extends restaurant{//user define class
	String rn;
	private String name;
	private int salary;
	Scanner sc = new Scanner(System.in);
	
	employee(){
    this.rn="    Crowne Restaurant";
   
	}
	employee(String n, int s)
	{
		 this.setName(n);
		 this.salary = s;
	
		System.out.print("\n\nThe Employee name: "+getName()+"\nMonthly Salary: RM "+salary+"\nRole: Waiter\n");
		
		}
	
	employee(String name ){
		this.setName(name);
	}
	void list() {
		System.out.print("\nThe Employee name: Abu"+"\nMonthly Salary: RM 4000"+"\nRole: Chef\n");
		System.out.print("\nThe Employee name: Shafiq"+"\nMonthly Salary: RM 3200"+"\nRole: Chef\n");
		System.out.print("\nThe Employee name: Ahmad"+"\nMonthly Salary: RM 1900"+"\nRole: Waiter\n");
		System.out.print("\nThe Employee name: Yusoff"+"\nMonthly Salary: RM 1950"+"\nRole: Cashier\n");
	}
	public String getName() {//encapsulation
		return name;
	}
	public void setName(String name) {//encapsulation
		this.name = name;
	}
	public String print() {//use abstract method 
		return "Crowne Restaurant";
	}
}