package project;

public class Manager extends Employee {
	String[] projects;

	public Manager(int id, String name, String address, double salary, String jobTitle,String[] projects) {
		super(id, name, address, salary, jobTitle);
		this.projects = projects;
		
	}
	protected void work() {
		 System.out.println("Managing Projects");
		 super.work();
		 for(int i = 0; i<projects.length;i++) {
			 System.out.println(projects[i]);
		 }
	 }

}
