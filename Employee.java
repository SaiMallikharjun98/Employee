package project;

public class Employee {
	int id;
 String name;
 String address;
 double salary;
 String jobTitle;
 
 public Employee(int id, String name,String address, double salary, String jobTitle) {
	 this.id = id;
	 this.name = name;
	 this.address = address;
	 this.salary = salary;
	 this.jobTitle = jobTitle;
 }
 
 protected void work() {
	 System.out.println("Common work for everyone");
 }
}
