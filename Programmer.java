package project;

public class Programmer extends Employee {
 String[] tools;
	public Programmer(int id, String name, String address, double salary, String jobTitle, String[] tools) {
		super(id, name, address, salary, jobTitle);
		this.tools = tools;
	}
	protected void work() {
		 System.out.println("Testing Projects");
		 super.work();
		 for(int i = 0; i<tools.length;i++) {
			 System.out.println(tools[i]);
		 }
	 }

}
