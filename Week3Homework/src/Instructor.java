
public class Instructor extends User {
	private String branch;

	 public  Instructor() {
		 
	 }

	public Instructor(String branch,int id, String firstName, String lastName, int age, String eMail, String password) {
		super( id,  firstName,  lastName,  age,  eMail,  password);
		this.branch = branch;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
	 

	

	}
	


