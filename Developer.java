package project;

public class Developer extends Employee {

	public Developer(int id, String name, String address, double salary, String jobTitle) {
		super(id, name, address, salary, jobTitle);
		
	}
	protected void work() {
		super.work();
		 System.out.println("Developing the Projects");
		 
		 
	 }

}
