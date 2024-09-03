package project;

public class MainTest {

	public static void main(String[] args) {
		String [] tools = {"JIRA","TEST NG"};
            Programmer p = new Programmer(161,"SAI","AMALAPURAM",1020000,"SE",tools);
            p.work();
            
            String[] projects = {"SIA","PG","MLP"};
           Manager m = new Manager(161,"SAI","AMALAPURAM",1020000,"SE",projects) ;
           m.work();
           System.out.println(m.id);
           System.out.println(m.name);
           System.out.println(m.address);
           System.out.println(m.salary);
           System.out.println(m.jobTitle);
           
           Developer d = new Developer(161,"SAI","AMALAPURAM",1020000,"SE");
           d.work();
	}

}
